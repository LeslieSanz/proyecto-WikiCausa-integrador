
package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import modelo.*;

public class MenuService {
    
    public Map<String, Integer> encontrarCoincidencias(List<RecetaDTO> recetas, List<DespensaDTO> despensa) {
    // Mapa para almacenar el número de coincidencias únicas para cada receta
    Map<String, Integer> coincidenciasPorReceta = new HashMap<>();

    // Procesar las recetas en función del número de coincidencias únicas
    for (RecetaDTO receta : recetas) {
        int coincidencias = 0;
        Set<Integer> ingredientesUtilizados = new HashSet<>(); // Conjunto para controlar los ingredientes ya utilizados

        // Recorrer los ingredientes de la receta
        for (IngredienteDTO ingredienteReceta : receta.getIngredientes()) {
            int idIngredienteReceta = ingredienteReceta.getId();

            // Verificar si el ingrediente de la receta está en la despensa y no ha sido utilizado
            for (DespensaDTO despensaDTO : despensa) {
                for (IngredienteDTO ingredienteDespensa : despensaDTO.getIngredientes()) {
                    int idIngredienteDespensa = ingredienteDespensa.getId();
                    
                    if (idIngredienteReceta == idIngredienteDespensa && !ingredientesUtilizados.contains(idIngredienteDespensa)) {
                        coincidencias++;
                        ingredientesUtilizados.add(idIngredienteDespensa); // Marcar el ingrediente como utilizado
                        break; // Salir del bucle interno
                    }
                }
            }
        }

        // Guardar el número de coincidencias para la receta
        coincidenciasPorReceta.put(receta.getId(), coincidencias);
    }

    return coincidenciasPorReceta;
}

public List<RecetaDTO> ordenarRecetasPorCoincidencias(List<RecetaDTO> recetas, Map<String, Integer> coincidenciasPorReceta) {
    return recetas.stream()
        .sorted((receta1, receta2) -> {
            int coincidencias1 = coincidenciasPorReceta.getOrDefault(receta1.getId(), 0);
            int coincidencias2 = coincidenciasPorReceta.getOrDefault(receta2.getId(), 0);
            return Integer.compare(coincidencias2, coincidencias1); // Ordenar de mayor a menor
        })
        .collect(Collectors.toList());
}

public List<IngredienteDTO> listarIngredientesFaltantes(List<RecetaDTO> recetas, List<DespensaDTO> despensa) {
    Set<Integer> ingredientesEnDespensa = new HashSet<>();
    List<IngredienteDTO> ingredientesFaltantes = new ArrayList<>();

    // Obtener todos los ingredientes presentes en la despensa
    for (DespensaDTO despensaDTO : despensa) {
        for (IngredienteDTO ingredienteDespensa : despensaDTO.getIngredientes()) {
            ingredientesEnDespensa.add(ingredienteDespensa.getId());
        }
    }

    // Iterar sobre cada receta y determinar los ingredientes faltantes
    for (RecetaDTO receta : recetas) {
        Set<Integer> ingredientesReceta = new HashSet<>();
        List<IngredienteDTO> ingredientesRecetaDTO = receta.getIngredientes();

        // Obtener los ingredientes de la receta actual
        for (IngredienteDTO ingredienteReceta : ingredientesRecetaDTO) {
            ingredientesReceta.add(ingredienteReceta.getId());
        }

        // Determinar los ingredientes que faltan para la receta actual
        for (Integer idIngredienteReceta : ingredientesReceta) {
            if (!ingredientesEnDespensa.contains(idIngredienteReceta)) {
                // El ingrediente de la receta no está en la despensa
                IngredienteDTO ingredienteFaltante = new IngredienteDTO();
                ingredienteFaltante.setId(idIngredienteReceta);
                ingredienteFaltante.setNombre(""); // Puedes llenar el nombre del ingrediente si lo necesitas
                ingredientesFaltantes.add(ingredienteFaltante);
            }
        }
    }

    return ingredientesFaltantes;
}
        public void crearMenu(List<RecetaDTO> recetasOrdenadas, String fechaInicio, String fechaFin, String dniUsuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConexion();

            // Generar nuevo ID de Menú
            String generarIdMenuQuery = "SELECT COALESCE(MAX(idMenu), 0) + 1 AS newId FROM menu";
            ps = conn.prepareStatement(generarIdMenuQuery);
            rs = ps.executeQuery();
            int idMenu = 1; // Inicialización por defecto
            if (rs.next()) {
                idMenu = rs.getInt("newId");
            }

            // Insertar en la tabla Menu
            String insertarMenuQuery = "INSERT INTO menu (idMenu, FechaInicio, FechaFin, Usuario_DNI) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(insertarMenuQuery);
            ps.setInt(1, idMenu);
            ps.setString(2, fechaInicio);
            ps.setString(3, fechaFin);
            ps.setString(4, dniUsuario);
            ps.executeUpdate();

            // Insertar en la tabla Menu_Detalle
            String insertarMenuDetalleQuery = "INSERT INTO menu_detalle (Menu_idMenu, Receta_idReceta, orden) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(insertarMenuDetalleQuery);

            int orden = 1;
            for (RecetaDTO receta : recetasOrdenadas) {
                ps.setInt(1, idMenu);
                ps.setString(2, receta.getId());
                ps.setInt(3, orden);
                ps.executeUpdate();
                orden++;
            }

            System.out.println("Menú creado exitosamente.");

        } catch (SQLException ex) {
            System.err.println("Error al crear el menú: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar conexiones: " + ex.getMessage());
            }
        }
    }
        
        public void cambiarReceta(int idMenu, int ordenActual) {
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion con = new Conexion();

            try {
                conn = con.getConexion();
                conn.setAutoCommit(false);  // Iniciar una transacción

                // 1. Obtener la receta que está en la posición ordenActual
                String queryRecetaActual = "SELECT idMenuDetalle, Receta_idReceta FROM menu_detalle WHERE Menu_idMenu = ? AND orden = ?";
                ps = conn.prepareStatement(queryRecetaActual);
                ps.setInt(1, idMenu);
                ps.setInt(2, ordenActual);
                rs = ps.executeQuery();

                if (rs.next()) {
                    int idMenuDetalleActual = rs.getInt("idMenuDetalle");
                    String recetaActual = rs.getString("Receta_idReceta");

                    // 2. Obtener la receta que está en la posición siguiente a ordenActual
                    String queryRecetaSiguiente = "SELECT idMenuDetalle, Receta_idReceta, orden FROM menu_detalle WHERE Menu_idMenu = ? AND orden = ?";
                    ps = conn.prepareStatement(queryRecetaSiguiente);
                    ps.setInt(1, idMenu);
                    ps.setInt(2, ordenActual + 1);
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        int idMenuDetalleSiguiente = rs.getInt("idMenuDetalle");
                        String recetaSiguiente = rs.getString("Receta_idReceta");
                        int ordenSiguiente = rs.getInt("orden");

                        // 3. Mover la receta de ordenActual al último lugar temporalmente
                        String updateRecetaActualTemp = "UPDATE menu_detalle SET orden = ? WHERE idMenuDetalle = ?";
                        ps = conn.prepareStatement(updateRecetaActualTemp);
                        ps.setInt(1, ordenSiguiente);  // Colocarla en la siguiente posición
                        ps.setInt(2, idMenuDetalleActual);
                        ps.executeUpdate();

                        // 4. Mover la receta en la posición siguiente a la posición actual
                        String updateRecetaSiguiente = "UPDATE menu_detalle SET orden = ? WHERE idMenuDetalle = ?";
                        ps = conn.prepareStatement(updateRecetaSiguiente);
                        ps.setInt(1, ordenActual);
                        ps.setInt(2, idMenuDetalleSiguiente);
                        ps.executeUpdate();

                        // 5. Mover todas las recetas después de la posición siguiente hacia arriba
                        String updateOrden = "UPDATE menu_detalle SET orden = orden - 1 WHERE Menu_idMenu = ? AND orden > ?";
                        ps = conn.prepareStatement(updateOrden);
                        ps.setInt(1, idMenu);
                        ps.setInt(2, ordenActual + 1);
                        ps.executeUpdate();

                        // 6. Colocar la receta de ordenActual (temporal) en la última posición
                        String queryUltimaReceta = "SELECT MAX(orden) AS ultimoOrden FROM menu_detalle WHERE Menu_idMenu = ?";
                        ps = conn.prepareStatement(queryUltimaReceta);
                        ps.setInt(1, idMenu);
                        rs = ps.executeQuery();
                        int ultimoOrden = 0;
                        if (rs.next()) {
                            ultimoOrden = rs.getInt("ultimoOrden");
                        }

                        String updateRecetaActualFinal = "UPDATE menu_detalle SET orden = ? WHERE idMenuDetalle = ?";
                        ps = conn.prepareStatement(updateRecetaActualFinal);
                        ps.setInt(1, ultimoOrden + 1);
                        ps.setInt(2, idMenuDetalleActual);
                        ps.executeUpdate();

                        conn.commit();  // Finalizar la transacción
                    }
                }
            } catch (SQLException ex) {
                try {
                    if (conn != null) {
                        conn.rollback();  // Deshacer la transacción en caso de error
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                ex.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    public List<MenuDetalleDTO> obtenerDetallesMenu(int idMenu) {
    List<MenuDetalleDTO> detallesMenu = new ArrayList<>();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion con = new Conexion();
    
    try {
        conn = con.getConexion();
        String query = "SELECT idMenuDetalle, Menu_idMenu, Receta_idReceta, orden FROM menu_detalle WHERE Menu_idMenu = ?";
        ps = conn.prepareStatement(query);
        ps.setInt(1, idMenu);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            MenuDetalleDTO detalle = new MenuDetalleDTO();
            detalle.setIdMenuDetalle(rs.getInt("idMenuDetalle"));
            detalle.setMenuIdMenu(rs.getInt("Menu_idMenu"));
            detalle.setRecetaIdReceta(rs.getString("Receta_idReceta"));
            detalle.setOrden(rs.getInt("orden"));
            detallesMenu.add(detalle);
        }
    } catch (SQLException ex) {
        Logger.getLogger(MenuService.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    return detallesMenu;
}

}


