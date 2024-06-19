package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import misInterfaces.IngredienteInterface;
import modelo.IngredienteDTO;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TipoIngrediente;

public class ingredienteDAO implements IngredienteInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<IngredienteDTO> lista = new ArrayList<>(); 
    IngredienteDTO i;
    
    //Para acceder al tipo de ingrediente
    TipoIngrediente ti;
    tipoIngredienteDAO tid = new tipoIngredienteDAO();
    
    @Override
    public boolean agregar(IngredienteDTO i) {
        try {
            String sql = "insert into ingredientes(Nombre,Tipo_Ingrediente_idTipo)"
                    + " values (?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, i.getNombre());
            ps.setInt(2, i.getTipo().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from ingredientes where idIngrediente = "+codigo;
            conn = con.getConexion();
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    @Override
    public boolean modificar(IngredienteDTO i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<IngredienteDTO> listarTodos() {
        try {
            String sql = "select * from ingredientes";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                i = new IngredienteDTO();
                i.setId(rs.getInt("idIngrediente"));
                i.setNombre(rs.getString("Nombre"));
               //Para el tipo de ingrediente
                String cti = rs.getString("Tipo_Ingrediente_idTipo");
                ti= tid.listarUno(cti);
                i.setTipo(ti);
                lista.add(i);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public IngredienteDTO listarUno(String codigo) {
        try {
            String sql = "select idIngrediente,Nombre from ingredientes where idIngrediente='"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                i = new IngredienteDTO();
                i.setId(rs.getInt("idIngrediente"));
                i.setNombre(rs.getString("Nombre"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    //Lista ingredientes por tipo
    public ArrayList<IngredienteDTO> listaIngrexTipo(String tipIng){
        try{
            conn = con.getConexion();
            String sql="{call sp_obtenerIngredientesPorTipo(?)}";
            CallableStatement st=conn.prepareCall(sql);
            st.setString(1, tipIng);
            ResultSet rs=st.executeQuery();

            while(rs.next()){
                i = new IngredienteDTO();
                i.setId(rs.getInt("idIngrediente"));
                i.setNombre(rs.getString("Nombre"));
               //Para el tipo de ingrediente
                String cti = rs.getString("Tipo_Ingrediente_idTipo");
                ti= tid.listarUno(cti);
                i.setTipo(ti);
                lista.add(i);       
            }
            conn.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return lista;
    } 
    
}
