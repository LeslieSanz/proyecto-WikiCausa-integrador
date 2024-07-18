package modeloDAO;

import config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                    
                    user.setNivel(rs.getString("Nivel"));
                    user.setFrecuencia(rs.getInt("Frecuencia"));
                    user.setCalmax(rs.getDouble("CalMin"));
                    user.setCalmin(rs.getDouble("CalMax"));
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
            
              String sqlProcedimiento = "CALL generarIdDespensa(?)";
        try (CallableStatement cstmt = cn.prepareCall(sqlProcedimiento)) {
            cstmt.setString(1, usu.getDni());
            cstmt.execute();
        } catch (SQLException ex) {
            System.out.println("Error al llamar al procedimiento almacenado generarIdDespensa: " + ex.getMessage());
        }

            
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
    
    public Usuario editarDatosUsu(String dni,Usuario user){
        String sql = "Update usuario set Nombres=?, Apellidos=?,Correo=? where DNI='"+dni+"'";
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){
            st.setString(1, user.getNombre());
            st.setString(2, user.getApellidos());
            st.setString(3, user.getCorreo());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al modificar Usuario: " + ex.getMessage());
        }
        return user;
    }
    
    public Usuario obtenerPassword(String dni){
        
        String sql = "SELECT Password FROM usuario WHERE DNI=?";
        Usuario user = new Usuario();
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){
            st.setString(1, dni);
            
            try (ResultSet rs= st.executeQuery()){
                if (rs.next()) {
                    user = new Usuario();
                    user.setPassword(rs.getString("Password"));
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener Usuario: " + ex.getMessage());
        }
        return user;
        
    }
    
    public void editarContraUsu(String contra,String dni){
        String sql = "Update usuario set Password=? where DNI="+dni;
        
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){
            st.setString(1, contra);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null , "Contraseña modificada");
        } catch (SQLException ex) {
            System.out.println("Error al modificar Contraseña: " + ex.getMessage());
        }
    }
    
    //Para agregar las preferencias
    public boolean agregarPreferencias(Usuario user) {
        
        String sql = "update usuario set Nivel=?, Frecuencia=?, CalMin=?, CalMax=?"
        + " where dni = '"+user.getDni()+"'";
        
        try(Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)){

            st.setString(1, user.getNivel());
            st.setInt(2, user.getFrecuencia());
            st.setDouble(3, user.getCalmin());
            st.setDouble(4, user.getCalmax());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar Usuario: " + ex.getMessage());
        }
        return false; 
    }
       
    
    
    public int contarRecetasPorRolC() {
    int count = 0;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        String sql = "SELECT COUNT(*) FROM usuario WHERE Rol = 'C'";
        Conexion con = new Conexion();
        conn = con.getConexion();
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        if (rs.next()) {
            count = rs.getInt(1);
        }
    } catch (SQLException ex) {
        Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Close resources in the reverse order of their creation
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    return count;
}

}
