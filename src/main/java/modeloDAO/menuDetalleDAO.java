package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.HistorialInterface;
import modelo.HistorialDTO;
import modelo.MenuDTO;
import modelo.MenuDetalleDTO;
import modelo.RecetaDTO;

public class menuDetalleDAO implements HistorialInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    ArrayList<MenuDetalleDTO> lista = new ArrayList<>(); 
    MenuDetalleDTO mdt;
    
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
    
    //Lista las 7 recetas de menu_detalle
    public ArrayList<MenuDetalleDTO> listarRecetasPorOptimizacion() {
        try {
            String sql = "SELECT Receta_idReceta,orden\n" +
                            "FROM menu_detalle\n" +
                            "WHERE orden BETWEEN 1 AND 7";
            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mdt = new MenuDetalleDTO();
                //Para la receta
                String cr = rs.getString("Receta_idReceta");
                r= rd.listarUno(cr);
                mdt.setReceta(r);
                               
                //Para capturar el orden
                mdt.setOrden(rs.getInt("orden"));
                
                lista.add(mdt);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaIngredientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    //Lista las 7 recetas de menu_detalle2
    public ArrayList<MenuDetalleDTO> listarRecetasPorPreferencias() {
        System.err.println("Entrando aqui");
        try {
            String sql = "SELECT Receta_idReceta,orden FROM menu_detalle2 WHERE orden BETWEEN 1 AND 7;";
            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mdt = new MenuDetalleDTO();
                //Para la receta
                String cr = rs.getString("Receta_idReceta");
                r= rd.listarUno(cr);
                mdt.setReceta(r);
                               
                //Para capturar el orden
                mdt.setOrden(rs.getInt("orden"));
                
                lista.add(mdt);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaIngredientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }


}
