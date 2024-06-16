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
    
    @Override
    public boolean agregar(RecetaIngredientesDTO ri) {
         try {
            String sql = "insert into receta_ingredientes (Receta_idReceta, Ingredientes_idIngrediente, Cantidad, Medida)"
                    + " values (?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ri.getIdReceta());
            ps.setInt(2, ri.getIngrediente().getId());
            ps.setDouble(3, ri.getCantidad());
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
}
