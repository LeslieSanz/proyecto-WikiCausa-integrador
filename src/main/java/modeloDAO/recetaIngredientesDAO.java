package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import misInterfaces.RecetaIngredienteInterface;
import modelo.IngredienteDTO;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.RecetaIngredientesDTO;

public class recetaIngredientesDAO implements RecetaIngredienteInterface{
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<RecetaIngredientesDTO> lista = new ArrayList<>(); 
    RecetaIngredientesDTO ri;
    
    IngredienteDTO i;
    ingredienteDAO id = new ingredienteDAO();
    
    @Override
    public boolean agregar(RecetaIngredientesDTO ri) {
         try {
            String sql = "insert into receta_ingredientes (Receta_idReceta, Ingredientes_idIngrediente, Cantidad, Medida)"
                    + " values (?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ri.getIdReceta());
            ps.setInt(2, ri.getIngrediente().getId());
            ps.setString(3, ri.getCantidad());
            ps.setString(4, ri.getMedida());
            ps.executeUpdate();
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
    public boolean modificar(RecetaIngredientesDTO ri) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RecetaIngredientesDTO> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RecetaIngredientesDTO listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
    
    //Para listar todos los ingredientes de una receta
    public ArrayList<RecetaIngredientesDTO> listarIngredientesPorReceta(String codReceta) {
        try {
            String sql = "select ingredientes_idIngrediente, Cantidad, Medida\n" +
            "from receta_ingredientes where Receta_idReceta ='" + codReceta + "'";
            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ri = new RecetaIngredientesDTO();
                
                //Para el ingrediente
                String ci = rs.getString("ingredientes_idIngrediente");
                i= id.listarUno(ci);
                ri.setIngrediente(i);

                ri.setCantidad(rs.getString("Cantidad"));
                ri.setMedida(rs.getString("Medida")); 
                
                lista.add(ri);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(recetaIngredientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
