package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.HistorialInterface;
import modelo.HistorialDTO;
import modelo.MenuDTO;
import modelo.RecetaDTO;

public class historialDAO implements HistorialInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    ArrayList<HistorialDTO> lista = new ArrayList<>(); 
    HistorialDTO h;
    
    MenuDTO m;
    menuDAO md = new menuDAO();
    
    RecetaDTO r;
    recetaDAO rd = new recetaDAO();
    
    @Override
    public boolean agregar(HistorialDTO h) {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(HistorialDTO h) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HistorialDTO> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HistorialDTO listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Para listar el historial de platos de un menu
    public ArrayList<HistorialDTO> listarPlatosDeUnMenu(String codMenu) {
        try {
            String sql = "select Fecha, Menu_idMenu, Receta_idReceta, Confirmacion\n" +
            "from historial where Menu_idMenu  =" + codMenu;
            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                h = new HistorialDTO();
                h.setFecha(rs.getString("Fecha"));
                
                //Para el menu
                String cm = rs.getString("Menu_idMenu");
                m= md.listarUno(cm);
                h.setMenu(m);
                
                //Para la receta
                String cr = rs.getString("Receta_idReceta");
                r= rd.listarUno(cr);
                h.setReceta(r);
                
                h.setConfirmacion(rs.getString("Confirmacion"));
                
                lista.add(h);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaIngredientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    //Para obtener la receta del día, específicamente de un usuario
    public HistorialDTO listarPlatoDelDia(String dni) {
        try {
            String sql = "SELECT Receta_idReceta \n" +
            "FROM historial as h \n" +
            "JOIN menu as m on h.Menu_IdMenu = m.idMenu\n" +
            "WHERE fecha = CURDATE() AND Usuario_DNI = '"+dni+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                h = new HistorialDTO();
                //Para la receta
                String cr = rs.getString("Receta_idReceta");
                r= rd.listarUno(cr);
                h.setReceta(r); 
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }
    

}
