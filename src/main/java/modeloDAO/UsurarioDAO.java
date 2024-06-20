package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

public class UsurarioDAO {
    
    public Usuario validarUsu(String correo, String password){
        
        String sql = "SELECT * FROM usuario WHERE Correo=? AND Password=?";
        Usuario user = null;
        
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){
            st.setString(1, correo);
            st.setString(2, password);
            
            try (ResultSet rs= st.executeQuery()){
                if (rs.next()) {
                    user = new Usuario();
                    user.setIdUsu(rs.getString("idUsu"));
                    user.setCorreo(rs.getString("Correo"));
                    user.setPassword(rs.getString("Password"));
                    user.setNombre(rs.getString("Nombres"));
                    user.setApellidoP(rs.getString("ApellidoP"));
                    user.setApellidoM(rs.getString("ApellidoM"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al validar Usuario: " + ex.getMessage());
        }
        return user;
    }
    
    public void AgregarUsu(Usuario usu){
        
        String sql="INSERT INTO usuario (idUsu,Correo,Password,Nombres,ApellidoP,ApellidoM,Rol) values(?,?,?,?,?,?,?)";
        try (Connection cn= Conexion.getConexion();PreparedStatement st= cn.prepareStatement(sql)){
            st.setString(1, usu.getIdUsu());
            st.setString(2, usu.getCorreo());
            st.setString(3, usu.getPassword());
            st.setString(4, usu.getNombre());
            st.setString(5, usu.getApellidoP());
            st.setString(6, usu.getApellidoM());
            st.setString(7, "C");
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al agregar usuario: "+ex.getMessage());
        }
    }
    
}
