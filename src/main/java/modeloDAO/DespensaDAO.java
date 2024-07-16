/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import static com.mysql.cj.conf.PropertyKey.USER;
import config.Conexion;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DespensaDTO;
import modelo.RecetaIngredientesDTO;
import modelo.Usuario;

/**
 *
 * @author yosse
 */
public class DespensaDAO {

    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<DespensaDTO> lista = new ArrayList<>();
    DespensaDTO i;

    public void agregar(String dni, int idIngrediente) {
        try {
            // Obtener la conexión
            conn = con.getConexion();

            // Obtener idDespensa basado en el DNI del usuario
            String obtenerIdDespensaQuery = "SELECT idDespensa FROM despensa WHERE Usuario_DNI = ?";
            ps = conn.prepareStatement(obtenerIdDespensaQuery);
            ps.setString(1, dni);
            rs = ps.executeQuery();

            int idDespensa = -1;
            if (rs.next()) {
                idDespensa = rs.getInt("idDespensa");
            }

            if (idDespensa != -1) {
                // Obtener el último numIngrediente para el usuario
                String obtenerUltimoNumQuery = "SELECT COALESCE(MAX(numIngrediente), 0) AS ultimoNum FROM despensa_ingrediente WHERE Despensa_idDespensa = ?";
                ps = conn.prepareStatement(obtenerUltimoNumQuery);
                ps.setInt(1, idDespensa);
                rs = ps.executeQuery();

                int ultimoNum = 0;
                if (rs.next()) {
                    ultimoNum = rs.getInt("ultimoNum");
                }

                // Incrementar el número de ingrediente
                int nuevoNumIngrediente = ultimoNum + 1;

                // Insertar el nuevo registro en despensa_ingrediente
                String insertQuery = "INSERT INTO despensa_ingrediente (Despensa_idDespensa, numIngrediente, Ingredientes_idIngrediente) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(insertQuery);
                ps.setInt(1, idDespensa);
                ps.setInt(2, nuevoNumIngrediente);
                ps.setInt(3, idIngrediente);
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

    public boolean eliminar(int num, String dni) {

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

            // Check if idDespensa was found
            if (idDespensa != -1) {
                String sql = "DELETE FROM despensa_ingrediente WHERE numIngrediente = ? AND despensa_idDespensa = ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, num);
                ps.setInt(2, idDespensa);
                int rowsAffected = ps.executeUpdate();

                return rowsAffected > 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DespensaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close the resources properly
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean modificar(RecetaIngredientesDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<DespensaDTO> listarTodos(String dniUsuario) {
        ArrayList<DespensaDTO> lista = new ArrayList<>(); // Inicializar la lista

        String query = "SELECT di.numIngrediente, i.Nombre AS NombreIngrediente "
                + "FROM despensa_ingrediente di "
                + "JOIN ingredientes i ON di.Ingredientes_idIngrediente = i.idIngrediente "
                + "JOIN despensa d ON di.Despensa_idDespensa = d.idDespensa "
                + "JOIN usuario u ON d.Usuario_DNI = u.DNI "
                + "WHERE u.DNI = ?";

        try {
            conn = con.getConexion(); // Obtener la conexión
            ps = conn.prepareStatement(query); // Preparar la consulta
            ps.setString(1, dniUsuario); // Establecer el parámetro del DNI del usuario
            rs = ps.executeQuery(); // Ejecutar la consulta

            int fila = 1; // Inicializar la variable para el número de fila

            while (rs.next()) {
                int numIngrediente = rs.getInt("numIngrediente");
                String nombreIngrediente = rs.getString("NombreIngrediente");

                // Crear objeto DespensaDTO con los datos obtenidos
                DespensaDTO dp = new DespensaDTO();
                dp.setIdDespensa(numIngrediente); // Asignar numIngrediente como idDespensa
                dp.setNombre(nombreIngrediente);

                lista.add(dp);
                fila++; // Incrementar el número de fila para el próximo objeto
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

        return lista;
    }

    public RecetaIngredientesDTO listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
