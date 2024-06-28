/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import static com.mysql.cj.conf.PropertyKey.USER;
import config.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.DespensaDTO;
import modelo.RecetaIngredientesDTO;

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

    public boolean agregar(DespensaDTO d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean modificar(RecetaIngredientesDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public ArrayList<DespensaDTO> listarTodos(String dniUsuario) {
        lista.clear();

        String query = "SELECT i.Nombre, di.cantidad "
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

            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                int cantidad = rs.getInt("cantidad");
                DespensaDTO dp = new DespensaDTO();
                String medida = dp.getNombre(); // Método para obtener la medida
                
                i = new DespensaDTO(nombre, cantidad, medida);
                lista.add(i);
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
