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

    public Usuario validarUsu(String dni, String password) {

        String sql = "SELECT * FROM usuario WHERE DNI=? AND Password=?";
        Usuario user = null;

        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, dni);
            st.setString(2, password);

            try (ResultSet rs = st.executeQuery()) {
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
                } else {
                    JOptionPane.showMessageDialog(null, "DNI y/o contraseña incorrectos");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al validar Usuario: " + ex.getMessage());
        }
        return user;
    }

    public void AgregarUsu(Usuario usu) {

        String sql = "INSERT INTO usuario (DNI,Correo,Password,Nombres,Apellidos,Rol) values(?,?,?,?,?,?)";
        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
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
            System.out.println("Error al agregar usuario: " + ex.getMessage());
        }
    }

    public Usuario ObtenerUsuario(String dni) {

        String sql = "SELECT * FROM usuario WHERE DNI=?";
        Usuario user = new Usuario();

        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, dni);

            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    user = new Usuario();
                    user.setDni(rs.getString("DNI"));
                    user.setCorreo(rs.getString("Correo"));
                    user.setPassword(rs.getString("Password"));
                    user.setNombre(rs.getString("Nombres"));
                    user.setApellidos(rs.getString("Apellidos"));
                    user.setNivel(rs.getString("Nivel"));
                    user.setFrecuencia(rs.getInt("Frecuencia"));
                    user.setRol(rs.getString("Rol"));
                    user.setSexo(rs.getString("genero"));
                    user.setEdad(rs.getInt("Edad"));
                    user.setPeso(rs.getDouble("Peso"));
                    user.setAltura(rs.getDouble("Altura"));
                    
                    user.setCalmin(rs.getDouble("CalMin"));
                    user.setCalmax(rs.getDouble("CalMax"));
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener Usuario: " + ex.getMessage());
        }
        return user;
    }

    public Usuario editarDatosUsu(String dni, Usuario user) {
        String sql = "Update usuario set Nombres=?, Apellidos=?,Correo=? where DNI='" + dni + "'";
        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
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

  

   public Usuario editarDatosUsu2(String dni, Usuario user) {
        String sql = "UPDATE usuario SET Nivel=?, Frecuencia=? WHERE DNI=?";
        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, user.getNivel());
            st.setInt(2, user.getFrecuencia());
            st.setString(3, dni);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al modificar Usuario: " + ex.getMessage());
        }
        return user;
    }

   public Usuario editarDatosUsu3(String dni, Usuario user) {
        String sql = "UPDATE usuario SET Edad=?, Peso=?, Altura=?, CalMin=?, CalMax=? WHERE DNI=?";
        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
            st.setInt(1, user.getEdad());
            st.setDouble(2, user.getPeso());
            st.setDouble(3, user.getAltura());
            st.setDouble(4, user.getCalmin());
            st.setDouble(5, user.getCalmax());
            st.setString(6, dni);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al modificar Usuario: " + ex.getMessage());
        }
        return user;
    }
 

    public Usuario obtenerPassword(String dni) {

        String sql = "SELECT Password FROM usuario WHERE DNI=?";
        Usuario user = new Usuario();
        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, dni);

            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    user = new Usuario();
                    user.setPassword(rs.getString("Password"));
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener Usuario: " + ex.getMessage());
        }
        return user;

    }

    public void editarContraUsu(String contra, String dni) {
        String sql = "Update usuario set Password=? where DNI=" + dni;

        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, contra);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contraseña modificada");
        } catch (SQLException ex) {
            System.out.println("Error al modificar Contraseña: " + ex.getMessage());
        }
    }

    //Para agregar las preferencias
    public boolean agregarPreferencias(Usuario user) {

        String sql = "update usuario set Nivel=?, Frecuencia=?, CalMin=?, CalMax=?, genero =?, Edad =?, Peso =?, Altura =?"
                + " where dni = '" + user.getDni() + "'";

        try (Connection cn = Conexion.getConexion(); PreparedStatement st = cn.prepareStatement(sql)) {

            st.setString(1, user.getNivel());
            st.setInt(2, user.getFrecuencia());
            st.setDouble(3, user.getCalmin());
            st.setDouble(4, user.getCalmax());
            st.setString(5, user.getSexo());
            st.setInt(6, user.getEdad());
            st.setDouble(7, user.getPeso());
            st.setDouble(8, user.getAltura());
            st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al modificar Usuario: " + ex.getMessage());
        }
        return false;
    }
    
    public Usuario obtenerUsuarioPorDNI(String dni) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Usuario usuario = null;

        try {
            conn = con.getConexion();
            String query = "SELECT * FROM usuario WHERE DNI = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, dni);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setDni(rs.getString("DNI"));
                usuario.setCorreo(rs.getString("Correo"));
                usuario.setPassword(rs.getString("Password"));
                usuario.setNombre(rs.getString("Nombres"));
                usuario.setApellidos(rs.getString("Apellidos"));
                usuario.setRol(rs.getString("Rol"));
                usuario.setNivel(rs.getString("Nivel"));
                usuario.setFrecuencia(rs.getInt("Frecuencia"));
                usuario.setCalmin(rs.getDouble("CalMin"));
                usuario.setCalmax(rs.getDouble("CalMax"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
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
        }

        return count;
    }

}
