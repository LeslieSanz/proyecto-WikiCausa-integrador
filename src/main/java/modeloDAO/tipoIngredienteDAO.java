package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.TipoIngredienteInterface;
import modelo.TipoIngrediente;

public class tipoIngredienteDAO implements TipoIngredienteInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<TipoIngrediente> lista = new ArrayList<>(); 
    TipoIngrediente ti;
    
    @Override
    public boolean agregar(TipoIngrediente ti) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(TipoIngrediente i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TipoIngrediente> listarTodos() {
        try {
            String sql = "select * from tipo_ingrediente";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ti = new TipoIngrediente();
                ti.setId(rs.getInt("idTipo"));
                ti.setNombre(rs.getString("Nombre"));
                lista.add(ti);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(tipoIngredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public TipoIngrediente listarUno(String codigo) {
        try {
            String sql = "select * from tipo_ingrediente where idTipo = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ti = new TipoIngrediente();
                ti.setId(rs.getInt("idTipo"));
                ti.setNombre(rs.getString("Nombre"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(tipoIngredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ti;
    }
    
}
