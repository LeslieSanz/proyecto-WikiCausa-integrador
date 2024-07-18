package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DespensaDTO;
import modelo.IngredienteDTO;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modelo.TipoIngrediente;
import modelo.Usuario;

public class DespensaDAO {

    Connection conn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public void agregar(String dni, int idIngrediente) {
        try {
            conn = con.getConexion();

            String obtenerIdDespensaQuery = "SELECT idDespensa FROM despensa WHERE Usuario_DNI = ?";
            ps = conn.prepareStatement(obtenerIdDespensaQuery);
            ps.setString(1, dni);
            rs = ps.executeQuery();

            int idDespensa = -1;
            if (rs.next()) {
                idDespensa = rs.getInt("idDespensa");
            }

            if (idDespensa != -1) {
                String obtenerUltimoNumQuery = "SELECT COALESCE(MAX(numIngrediente), 0) AS ultimoNum FROM despensa_ingrediente WHERE Despensa_idDespensa = ?";
                ps = conn.prepareStatement(obtenerUltimoNumQuery);
                ps.setInt(1, idDespensa);
                rs = ps.executeQuery();

                int ultimoNum = 0;
                if (rs.next()) {
                    ultimoNum = rs.getInt("ultimoNum");
                }

                int nuevoNumIngrediente = ultimoNum + 1;

                String insertQuery = "INSERT INTO despensa_ingrediente (Despensa_idDespensa, numIngrediente, Ingredientes_idIngrediente) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(insertQuery);
                ps.setInt(1, idDespensa);
                ps.setInt(2, nuevoNumIngrediente);
                ps.setInt(3, idIngrediente);
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DespensaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void eliminar(int numIngrediente, String dni) {
        try {
            String obtenerIdDespensaQuery = "SELECT idDespensa FROM despensa WHERE Usuario_DNI = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(obtenerIdDespensaQuery);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            int idDespensa = -1;
            if (rs.next()) {
                idDespensa = rs.getInt("idDespensa");
            }

            if (idDespensa != -1) {
                String eliminarQuery = "DELETE FROM despensa_ingrediente WHERE Despensa_idDespensa = ? AND numIngrediente = ?";
                ps = conn.prepareStatement(eliminarQuery);
                ps.setInt(1, idDespensa);
                ps.setInt(2, numIngrediente);
                ps.executeUpdate();

                String actualizarQuery = "UPDATE despensa_ingrediente SET numIngrediente = numIngrediente - 1 WHERE Despensa_idDespensa = ? AND numIngrediente > ?";
                ps = conn.prepareStatement(actualizarQuery);
                ps.setInt(1, idDespensa);
                ps.setInt(2, numIngrediente);
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DespensaDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<DespensaDTO> listarTodos(String dniUsuario) {
        ArrayList<DespensaDTO> lista = new ArrayList<>();

        String query = "SELECT di.numIngrediente, i.Nombre AS NombreIngrediente "
                + "FROM despensa_ingrediente di "
                + "JOIN ingredientes i ON di.Ingredientes_idIngrediente = i.idIngrediente "
                + "JOIN despensa d ON di.Despensa_idDespensa = d.idDespensa "
                + "JOIN usuario u ON d.Usuario_DNI = u.DNI "
                + "WHERE u.DNI = ?";

        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(query);
            ps.setString(1, dniUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {
                int numIngrediente = rs.getInt("numIngrediente");
                String nombreIngrediente = rs.getString("NombreIngrediente");

                DespensaDTO dp = new DespensaDTO();
                dp.setIdDespensa(numIngrediente);
                dp.setNombre(nombreIngrediente);

                lista.add(dp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return lista;
    }

    public List<DespensaDTO> obtenerIngredientesPorUsuario(String dniUsuario) {
        List<DespensaDTO> despensas = new ArrayList<>();

        String query = "SELECT d.idDespensa, di.numIngrediente, i.idIngrediente, i.Nombre AS nombreIngrediente "
                + "FROM despensa_ingrediente di "
                + "JOIN ingredientes i ON di.Ingredientes_idIngrediente = i.idIngrediente "
                + "JOIN despensa d ON di.Despensa_idDespensa = d.idDespensa "
                + "WHERE d.Usuario_DNI = ?";

        try {
            conn = con.getConexion();
            ps = conn.prepareStatement(query);
            ps.setString(1, dniUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idDespensa = rs.getInt("idDespensa");
                int numIngrediente = rs.getInt("numIngrediente");
                int idIngrediente = rs.getInt("idIngrediente");
                String nombreIngrediente = rs.getString("nombreIngrediente");

                DespensaDTO despensa = new DespensaDTO();
                despensa.setIdDespensa(idDespensa);

                IngredienteDTO ingrediente = new IngredienteDTO();
                ingrediente.setId(idIngrediente);
                ingrediente.setNombre(nombreIngrediente);

                // Busca si ya existe una despensa con el mismo idDespensa
                DespensaDTO despensaExistente = null;
                for (DespensaDTO d : despensas) {
                    if (d.getIdDespensa() == idDespensa) {
                        despensaExistente = d;
                        break;
                    }
                }

                if (despensaExistente == null) {
                    List<IngredienteDTO> ingredientes = new ArrayList<>();
                    ingredientes.add(ingrediente);
                    despensa.setIngredientes(ingredientes);
                    despensas.add(despensa);
                } else {
                    despensaExistente.getIngredientes().add(ingrediente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return despensas;
    }



}
