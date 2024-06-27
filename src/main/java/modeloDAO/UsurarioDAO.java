package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class UsurarioDAO {
    
    public Usuario validarUsu(String dni, String password){
        
        String sql = "SELECT * FROM usuario WHERE DNI=? AND Password=?";
        Usuario user = null;
        
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){
            st.setString(1, dni);
            st.setString(2, password);
            
            try (ResultSet rs= st.executeQuery()){
                if (rs.next()) {
                    user = new Usuario();
                    user.setDni(rs.getString("DNI"));
                    user.setCorreo(rs.getString("Correo"));
                    user.setPassword(rs.getString("Password"));
                    user.setNombre(rs.getString("Nombres"));
                    user.setApellidos(rs.getString("Apellidos"));
                    user.setRol(rs.getString("Rol"));
                }else{
                    JOptionPane.showMessageDialog(null, "DNI y/o contraseña incorrectos");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al validar Usuario: " + ex.getMessage());
        }
        return user;
    }
    
    public void AgregarUsu(Usuario usu){
        
        String sql="INSERT INTO usuario (DNI,Correo,Password,Nombres,Apellidos,Rol) values(?,?,?,?,?,?)";
        try (Connection cn= Conexion.getConexion();PreparedStatement st= cn.prepareStatement(sql)){
            st.setString(1, usu.getDni());
            st.setString(2, usu.getCorreo());
            st.setString(3, usu.getPassword());
            st.setString(4, usu.getNombre());
            st.setString(5, usu.getApellidos());
            st.setString(6, "C");
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al agregar usuario: "+ex.getMessage());
        }
    }
    
    public Usuario ObtenerUsuario(String dni){
        
        String sql = "SELECT * FROM usuario WHERE DNI=?";
        Usuario user = new Usuario();
        
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){
            st.setString(1, dni);
            
            try (ResultSet rs= st.executeQuery()){
                if (rs.next()) {
                    user = new Usuario();
                    user.setDni(rs.getString("DNI"));
                    user.setCorreo(rs.getString("Correo"));
                    user.setPassword(rs.getString("Password"));
                    user.setNombre(rs.getString("Nombres"));
                    user.setApellidos(rs.getString("Apellidos"));
                    user.setRol(rs.getString("Rol"));
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener Usuario: " + ex.getMessage());
        }
        return user;
    }
    
}
