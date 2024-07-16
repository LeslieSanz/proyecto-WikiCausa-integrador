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
            String insertQuery = "INSERT INTO despensa_ingrediente (Despensa_idDespensa, Ingredientes_idIngrediente) VALUES (?, ?)";
            ps = conn.prepareStatement(insertQuery);
            ps.setInt(1, idDespensa);
            ps.setInt(2, idIngrediente);
            ps.executeUpdate();
        }
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(DespensaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    

    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean modificar(RecetaIngredientesDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public ArrayList<DespensaDTO> listarTodos(String dniUsuario) {
    ArrayList<DespensaDTO> lista = new ArrayList<>(); // Inicializar la lista

    String query = "SELECT i.idIngrediente, i.Nombre AS NombreIngrediente "
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
            int idIngrediente = rs.getInt("idIngrediente");
            String nombreIngrediente = rs.getString("NombreIngrediente");

            // Crear objeto DespensaDTO con los datos obtenidos
            DespensaDTO dp = new DespensaDTO();
            dp.setIdDespensa(fila); // Asignar el número de fila
            dp.setNombre(nombreIngrediente);

            lista.add(dp);
            fila++; // Incrementar el número de fila para el próximo objeto
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar ResultSet, PreparedStatement y Connection
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
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
