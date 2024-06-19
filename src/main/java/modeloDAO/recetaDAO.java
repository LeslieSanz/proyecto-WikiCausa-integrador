package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.RecetaInterface;
import modelo.RecetaDTO;

public class recetaDAO implements RecetaInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<RecetaDTO> lista = new ArrayList<>(); 
    RecetaDTO r;
    
    @Override
    public boolean agregar(RecetaDTO r) {
        try {
            
            String sql = "insert into receta (idReceta, Nombre, TipoComida_idTipo, Preparacion, Porcion, TiempoPreparacion, Calorias, Imagen)"
                       + " values (?, ?, ?, ?, ?, ?, ?, ?)";
            conn = con.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, r.getId());
            ps.setString(2, r.getNombre());
            ps.setInt(3, r.getTipo().getId());
            ps.setString(4, r.getPreparacion());
            ps.setInt(5, r.getPorcion());
            ps.setInt(6, r.getTiempo());
            ps.setDouble(7, r.getCalorias());
            ps.setString(8, r.getImagen());
            ps.executeUpdate();
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(RecetaDTO r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RecetaDTO> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RecetaDTO listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String generaCodReceta() {
    String cod="";

    try {
        String sql = "{? = call generarNuevoCodigoReceta()}";
        conn = con.getConexion();
        CallableStatement st = conn.prepareCall(sql);
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        cod = st.getString(1);

        } catch (SQLException ex) {
        Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cod;
    }
}
