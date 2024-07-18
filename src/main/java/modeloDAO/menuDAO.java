package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import java.time.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.MenuInterface;
import modelo.MenuDTO;
import modelo.Usuario;

public class menuDAO implements MenuInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    ArrayList<MenuDTO> lista = new ArrayList<>(); 
    MenuDTO m;
    
    Usuario u;
    UsurarioDAO ud = new UsurarioDAO();
    
    @Override
    public boolean agregar(MenuDTO m) {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(MenuDTO m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<MenuDTO> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MenuDTO listarUno(String codigo) {
        try {
            String sql = "select idMenu, FechaInicio, FechaFin, Usuario_DNI from menu where idMenu = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                m = new MenuDTO();
                m.setId(rs.getString("idMenu"));
                m.setFecha_inicio(rs.getString("FechaInicio"));
                m.setFecha_final(rs.getString("FechaFin"));
                
                //Para el ingrediente
                String cu = rs.getString("Usuario_DNI");
                u= ud.ObtenerUsuario(cu);
                m.setUsuario(u);
  
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(menuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }
    
    public boolean FechasExistentes(java.util.Date fechaINI, java.util.Date fechaFIN,String dniUsuario) {
        boolean fechasExistentes = false;
        try {
            java.sql.Date sqlFechaInicio = new java.sql.Date(fechaINI.getTime());
            java.sql.Date sqlFechaFin = new java.sql.Date(fechaFIN.getTime());

            String sql = "SELECT COUNT(*) FROM menu WHERE (FechaInicio = ? OR FechaFin = ?) AND Usuario_DNI = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);

            ps.setDate(1, sqlFechaInicio);
            ps.setDate(2, sqlFechaFin);
            ps.setString(3, dniUsuario);

            rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    fechasExistentes = true;
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(menuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechasExistentes;
    }
    
    

}
