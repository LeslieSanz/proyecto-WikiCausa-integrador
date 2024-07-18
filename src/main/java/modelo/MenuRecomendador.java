package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import modeloDAO.recetaDAO;
import modeloDAO.tipoComidaDAO;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Omar Tc
 */
public class MenuRecomendador {

    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    TipoComida tp;
    tipoComidaDAO tpDao = new tipoComidaDAO();

    public static void main(String[] args) {
        // Paso 1: Obtener las recetas ordenadas por calorías descendentes
        List<RecetaDTO> recetas = obtenerRecetasOrdenadasPorCalorias();

        // Paso 2: Ordenar las recetas en grupos de 7 dentro del rango de calorías
        ordenarRecetasPorRangoCalorias(recetas);

        // Paso 3: Imprimir el resultado por consola sin modificar las calorías originales
        for (RecetaDTO receta : recetas) {
            System.out.println("Nombre: " + receta.getNombre() + ", Calorías: " + receta.getCalorias());
        }
        
        crearMenu(recetas, "2024-07-15", "2024-07-21", "8888888");
        
    }

    // Método para obtener las recetas ordenadas por calorías descendentes
    private static List<RecetaDTO> obtenerRecetasOrdenadasPorCalorias() {
        recetaDAO dao = new recetaDAO();
        return dao.listarPorCaloriasDesc();
    }

    // Método para ordenar las recetas en grupos de 7 dentro del rango de calorías
    private static void ordenarRecetasPorRangoCalorias(List<RecetaDTO> recetas) {
        // Definir el rango de calorías
        double rangoMinimo = 1500.0; // Ejemplo de rango mínimo
        double rangoMaximo = 4000.0; // Ejemplo de rango máximo

        // Ordenar todas las recetas por calorías descendentes (ya deberían estar ordenadas)
        Collections.sort(recetas, Comparator.comparingDouble(RecetaDTO::getCalorias).reversed());

        // Iterar y agrupar las recetas en grupos de 7 dentro del rango de calorías
        for (int i = 0; i < recetas.size(); i += 7) {
            // Obtener el subconjunto de recetas para este grupo de 7
            List<RecetaDTO> grupo = recetas.subList(i, Math.min(i + 7, recetas.size()));

            // Calcular la suma total de calorías del grupo
            double sumaCalorias = grupo.stream().mapToDouble(RecetaDTO::getCalorias).sum();

            // Verificar y ajustar las recetas dentro del rango de calorías
            if (sumaCalorias < rangoMinimo || sumaCalorias > rangoMaximo) {
                // Calcular el factor de ajuste proporcional
                double factorAjuste = 1.0;
                if (sumaCalorias < rangoMinimo) {
                    factorAjuste = rangoMinimo / sumaCalorias;
                } else if (sumaCalorias > rangoMaximo) {
                    factorAjuste = rangoMaximo / sumaCalorias;
                }

                // Aplicar el ajuste proporcional a las calorías temporales del grupo y redondear
                for (RecetaDTO receta : grupo) {
                    double nuevasCalorias = receta.getCalorias() * factorAjuste;
                    receta.setCalorias(Math.round(nuevasCalorias)); // Redondear las calorías ajustadas
                }
            }
        }
    }

    public static void crearMenu(List<RecetaDTO> recetasOrdenadas, String fechaInicio, String fechaFin, String dniUsuario) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = Conexion.getConexion();
            //Generar nuevo ID de menu
            String generarIdMenuQuery = "SELECT COALESCE(MAX(idMenu), 0) + 1 AS newId FROM menu";
            ps = conn.prepareStatement(generarIdMenuQuery);
            rs = ps.executeQuery();
            int idMenu = 1; // Inicialización por defecto
            if (rs.next()) {
                idMenu = rs.getInt("newId");
            }

            //insertar en la tabla menu
            String insertarMenuQuery = "INSERT INTO menu (idMenu, FechaInicio, FechaFin, Usuario_DNI) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(insertarMenuQuery);
            ps.setInt(1, idMenu);
            ps.setString(2, fechaInicio);
            ps.setString(3, fechaFin);
            ps.setString(4, dniUsuario);
            ps.executeUpdate();

            // Insertar en la tabla Menu_Detalle
            String insertarMenuDetalleQuery = "INSERT INTO menu_detalle2 (Menu_idMenu, Receta_idReceta, orden) VALUES (?, ?, ?)";

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
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
    }
}
