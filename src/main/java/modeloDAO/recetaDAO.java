package modeloDAO;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.RecetaDTO;
import misInterfaces.RecetaInterface;
import modelo.DespensaDTO;
import modelo.IngredienteDTO;
import modelo.RecetaIngredientesDTO;
import modelo.TipoComida;
import modelo.TipoIngrediente;

public class recetaDAO implements RecetaInterface {
    private Connection conn;
    private Conexion con = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<RecetaDTO> lista = new ArrayList<>();
    private RecetaDTO r;
    TipoComida tp;
    tipoComidaDAO tpDao = new tipoComidaDAO();


    @Override
    public boolean agregar(RecetaDTO r) {
        String sql = "INSERT INTO receta (idReceta, Nombre, TipoComida_idTipo, Preparacion, Porcion, TiempoPreparacion, Calorias, Imagen) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getId());
            ps.setString(2, r.getNombre());
            ps.setInt(3, r.getTipo().getId());
            ps.setString(4, r.getPreparacion());
            ps.setInt(5, r.getPorcion());
            ps.setInt(6, r.getTiempo());
            ps.setDouble(7, r.getCalorias());
            ps.setString(8, r.getImagen());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        String sql = "DELETE FROM receta WHERE idReceta = ?";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public boolean modificar(RecetaDTO r) {
        String sql = "UPDATE receta SET Nombre = ?, TipoComida_idTipo = ?, Preparacion = ?, Porcion = ?, TiempoPreparacion = ?, Calorias = ?, Imagen = ? " +
                     "WHERE idReceta = ?";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getNombre());
            ps.setInt(2, r.getTipo().getId());
            ps.setString(3, r.getPreparacion());
            ps.setInt(4, r.getPorcion());
            ps.setInt(5, r.getTiempo());
            ps.setDouble(6, r.getCalorias());
            ps.setString(7, r.getImagen());
            ps.setString(8, r.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public ArrayList<RecetaDTO> listarTodos() {
        String sql = "SELECT idReceta, Nombre, Porcion, TiempoPreparacion, Calorias FROM receta";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                r = new RecetaDTO();
                r.setId(rs.getString("idReceta"));
                r.setNombre(rs.getString("Nombre"));
                r.setPorcion(rs.getInt("Porcion"));
                r.setTiempo(rs.getInt("TiempoPreparacion"));
                r.setCalorias(rs.getDouble("Calorias"));
                lista.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    @Override
    public RecetaDTO listarUno(String codigo) {
        try {
            String sql = "select idReceta,Nombre, Porcion, TiempoPreparacion, Calorias, Preparacion, Imagen from receta where idReceta = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new RecetaDTO();
                r.setId(rs.getString("idReceta"));
                r.setNombre(rs.getString("Nombre"));
                r.setPorcion(rs.getInt("Porcion"));
                r.setTiempo(rs.getInt("TiempoPreparacion"));
                r.setCalorias(rs.getInt("Calorias"));
                r.setPreparacion(rs.getString("Preparacion"));
                r.setImagen(rs.getString("Imagen"));
                
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public String generaCodReceta() {
        String cod = "";
        try {
            String sql = "{? = call generarNuevoCodigoReceta()}";
            conn = con.getConexion();
            CallableStatement st = conn.prepareCall(sql);
            st.registerOutParameter(1, Types.VARCHAR);
            st.execute();
            cod = st.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cod;
    }

    public ArrayList<RecetaDTO> listarRecetasPorCat(int codtip) {
        String sql = "SELECT idReceta, Nombre, Porcion, TiempoPreparacion, Calorias FROM receta WHERE TipoComida_idTipo = ?";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codtip);
            rs = ps.executeQuery();
            while (rs.next()) {
                r = new RecetaDTO();
                r.setId(rs.getString("idReceta"));
                r.setNombre(rs.getString("Nombre"));
                r.setPorcion(rs.getInt("Porcion"));
                r.setTiempo(rs.getInt("TiempoPreparacion"));
                r.setCalorias(rs.getDouble("Calorias"));
                lista.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

     public List<RecetaDTO> obtenerRecetas() {
        List<RecetaDTO> recetas = new ArrayList<>();
        String sql = "SELECT * FROM receta";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                RecetaDTO receta = new RecetaDTO();
                receta.setId(rs.getString("idReceta"));
                receta.setNombre(rs.getString("Nombre"));
                receta.setPorcion(rs.getInt("Porcion"));
                receta.setTiempo(rs.getInt("TiempoPreparacion"));
                receta.setCalorias(rs.getDouble("Calorias"));
                receta.setPreparacion(rs.getString("Preparacion"));
                receta.setImagen(rs.getString("Imagen"));
                recetas.add(receta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return recetas;
    }

    public List<RecetaIngredientesDTO> obtenerTodosLosIngredientesDeRecetas() {
        List<RecetaIngredientesDTO> ingredientesRecetas = new ArrayList<>();
        String sql = "SELECT ri.idComidaIngredientes, ri.Receta_idReceta, ri.Ingredientes_idIngrediente, ri.Cantidad, ri.Medida, i.* " +
                     "FROM receta_ingredientes ri " +
                     "JOIN ingredientes i ON ri.Ingredientes_idIngrediente = i.idIngrediente";
        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                RecetaIngredientesDTO recetaIngredientes = new RecetaIngredientesDTO();
                IngredienteDTO ingrediente = new IngredienteDTO();

                // Asignar valores a la recetaIngredientes
                recetaIngredientes.setIdReceta(rs.getString("Receta_idReceta"));
                recetaIngredientes.setCantidad(rs.getString("Cantidad"));
                recetaIngredientes.setMedida(rs.getString("Medida"));

                // Asignar valores al ingrediente
                ingrediente.setId(rs.getInt("Ingredientes_idIngrediente"));
                ingrediente.setNombre(rs.getString("Nombre"));
                // Aquí puedes agregar más campos según tu definición de IngredienteDTO

                recetaIngredientes.setIngrediente(ingrediente);
                ingredientesRecetas.add(recetaIngredientes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ingredientesRecetas;
    }

    public List<RecetaDTO> obtenerRecetasConIngredientes() {
        List<RecetaDTO> recetas = obtenerRecetas();
        Map<String, List<IngredienteDTO>> ingredientesPorReceta = new HashMap<>();

        String sql = "SELECT ri.Receta_idReceta, ri.Ingredientes_idIngrediente, ri.Cantidad, ri.Medida, i.Nombre AS nombreIngrediente " +
                     "FROM receta_ingredientes ri " +
                     "JOIN ingredientes i ON ri.Ingredientes_idIngrediente = i.idIngrediente";

        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String idReceta = rs.getString("Receta_idReceta");
                IngredienteDTO ingrediente = new IngredienteDTO();

                // Asignar valores al ingrediente
                ingrediente.setId(rs.getInt("Ingredientes_idIngrediente"));
                ingrediente.setNombre(rs.getString("nombreIngrediente"));

                // Agrupar los ingredientes por receta
                ingredientesPorReceta.computeIfAbsent(idReceta, k -> new ArrayList<>()).add(ingrediente);
            }

            // Asignar los ingredientes a cada receta
            for (RecetaDTO receta : recetas) {
                receta.setIngredientes(ingredientesPorReceta.getOrDefault(receta.getId(), new ArrayList<>()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return recetas;
    }


     public int contarFilasReg() {
        int count = 0;

        try {
            String sql = "SELECT COUNT(*) FROM receta";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }
     
    public int contarTipo(int n) {
        int count = 0;

        try {
            String sql = "SELECT COUNT(*) FROM receta where TipoComida_idTipo='"+n+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }
    
     //Listar Recetas colocando las calorias mas altas primero
    public ArrayList<RecetaDTO> listarPorCaloriasDesc() {
        try {
            String sql = "SELECT * FROM receta ORDER BY Calorias DESC";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                r = new RecetaDTO();
                r.setId(rs.getString("idReceta"));
                r.setNombre(rs.getString("Nombre"));
                int cod = rs.getInt("TipoComida_idTipo");
                tp = tpDao.listarUno(cod);
                r.setTipo(tp);
                r.setPorcion(rs.getInt("Porcion"));
                r.setTiempo(rs.getInt("TiempoPreparacion"));
                r.setCalorias(rs.getDouble("Calorias"));
                lista.add(r);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static List<RecetaDTO> obtenerRecetasOrdenadasPorCalorias() {
        recetaDAO dao = new recetaDAO();
        return dao.listarPorCaloriasDesc();
    }

    public static List<List<RecetaDTO>> ordenarRecetasPorRangoCalorias(List<RecetaDTO> recetas, double rangoMinimo, double rangoMaximo) {
        Collections.sort(recetas, Comparator.comparingDouble(RecetaDTO::getCalorias).reversed());
        List<List<RecetaDTO>> gruposValidos = new ArrayList<>();
        List<RecetaDTO> grupoActual = new ArrayList<>();

        for (RecetaDTO receta : recetas) {
            grupoActual.add(receta);
            if (grupoActual.size() == 7) {
                double sumaCalorias = grupoActual.stream().mapToDouble(RecetaDTO::getCalorias).sum();
                if (sumaCalorias >= rangoMinimo && sumaCalorias <= rangoMaximo) {
                    gruposValidos.add(new ArrayList<>(grupoActual));
                }
                grupoActual.clear();
            }
        }
        if (!grupoActual.isEmpty()) {
            gruposValidos.add(new ArrayList<>(grupoActual));
        }
        return gruposValidos;
    }


//Lista recetas por tipo
//    public ArrayList<IngredienteDTO> listaIngrexTipo(int id){
//        try{
//            conn = con.getConexion();
//            String sql="{call  GetIngredienteMedidaByTipo(?)}";
//            CallableStatement st=conn.prepareCall(sql);
//            st.setInt(1, id);
//            ResultSet rs=st.executeQuery();
//
//            while(rs.next()){
//                i = new IngredienteDTO();
//                i.setNombre(rs.getString("IngredienteMedida"));
//                lista.add(i);       
//            }
//            conn.close();
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return lista;
//    } 

}
