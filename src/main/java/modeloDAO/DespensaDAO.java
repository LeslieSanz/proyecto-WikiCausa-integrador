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

     public boolean agregar(String dniUsuario, String ingredienteMedida, int cant, String nomMedida) {
    int idDespensa = -1;
    int idIngrediente = -1;
    int idMedida = -1;

    try {
        conn = con.getConexion();
        
        // Obtener el idDespensa basado en el dniUsuario
        String sqlDespensa = "SELECT idDespensa FROM despensa WHERE Usuario_DNI = ?";
        ps = conn.prepareStatement(sqlDespensa);
        ps.setString(1, dniUsuario);
        rs = ps.executeQuery();
        if (rs.next()) {
            idDespensa = rs.getInt("idDespensa");
        } else {
            System.out.println("Despensa no encontrado.");
            return false;
        }
        rs.close();
        ps.close();
        
        // Dividir la cadena ingredienteMedida en partes
        String[] partes = ingredienteMedida.split("-");
        String nomIngre = partes[0]; // Extraer el nombre del ingrediente
        
        // Obtener idIngrediente basado en el nombre del ingrediente
        String sqlIngrediente = "SELECT idIngrediente FROM ingredientes WHERE Nombre = ?";
        ps = conn.prepareStatement(sqlIngrediente);
        ps.setString(1, nomIngre);
        rs = ps.executeQuery();
        if (rs.next()) {
            idIngrediente = rs.getInt("idIngrediente");
        } else {
            System.out.println("Ingrediente no encontrado.");
            return false;
        }
        rs.close();
        ps.close();

        // Obtener idMedida basado en el nombre de la medida
        String sqlMedida = "SELECT idMedida FROM medida WHERE Nombre = ?";
        ps = conn.prepareStatement(sqlMedida);
        ps.setString(1, nomMedida);
        rs = ps.executeQuery();
        if (rs.next()) {
            idMedida = rs.getInt("idMedida");
        } else {
            System.out.println("Medida no encontrada.");
            return false;
        }
        rs.close();
        ps.close();

        // Llamar al procedimiento almacenado
        String sqlProcedure = "{call agregarIngrediente(?,?,?,?)}";
        CallableStatement cs = conn.prepareCall(sqlProcedure);
        cs.setInt(1, idDespensa);
        cs.setInt(2, idIngrediente);
        cs.setInt(3, cant);
        cs.setInt(4, idMedida);
        
        int rowsAffected = cs.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException ex) {
        Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Cerrar recursos en el bloque finally para asegurar su liberación
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return false;
}

    

    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean modificar(RecetaIngredientesDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
   public ArrayList<DespensaDTO> listarTodos(String dniUsuario) {
    lista.clear();

    String query = "SELECT i.Nombre AS NombreIngrediente, di.cantidad, m.Nombre AS NombreMedida "
                 + "FROM despensa_ingrediente di "
                 + "JOIN ingredientes i ON di.Ingredientes_idIngrediente = i.idIngrediente "
                 + "JOIN despensa d ON di.Despensa_idDespensa = d.idDespensa "
                 + "JOIN usuario u ON d.Usuario_DNI = u.DNI "
                 + "JOIN medida m ON di.idMedida = m.idMedida "
                 + "WHERE u.DNI = ?";

    try {
        conn = con.getConexion(); // Obtener la conexión
        ps = conn.prepareStatement(query); // Preparar la consulta
        ps.setString(1, dniUsuario); // Establecer el parámetro del DNI del usuario
        rs = ps.executeQuery(); // Ejecutar la consulta

        while (rs.next()) {
            String nombreIngrediente = rs.getString("NombreIngrediente");
            int cantidad = rs.getInt("cantidad");
            String nombreMedida = rs.getString("NombreMedida");

            // Crear objeto DespensaDTO con los datos obtenidos
            DespensaDTO dp = new DespensaDTO(nombreIngrediente, cantidad, nombreMedida);
            lista.add(dp);
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
