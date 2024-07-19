package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.TipoComidaInterface;
import modelo.TipoComida;

public class tipoComidaDAO implements TipoComidaInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<TipoComida> lista = new ArrayList<>(); 
    TipoComida tc;
    
    @Override
    public boolean agregar(TipoComida tc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(TipoComida tc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TipoComida> listarTodos() {
        try {
            String sql = "select * from tipocomida";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                tc = new TipoComida();
                tc.setId(rs.getInt("idTipo"));
                tc.setNombre(rs.getString("NombreTipo"));
                lista.add(tc);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(tipoComidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }


    public TipoComida listarUno(int codigo) {
        try {
            String sql = "select * from tipocomida where idTipo = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                tc = new TipoComida();
                tc.setId(rs.getInt("idTipo"));
                tc.setNombre(rs.getString("NombreTipo"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(tipoComidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tc;
    }


    
    public TipoComida listarUno2(String codigo) {
         try {
            String sql = "select * from tipocomida where idTipo = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                tc = new TipoComida();
                tc.setId(rs.getInt("idTipo"));
                tc.setNombre(rs.getString("NombreTipo"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(tipoComidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tc;
    }

    @Override
    public TipoComida listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
