package modeloDAO;

import config.Conexion;
import java.util.ArrayList;
import misInterfaces.IngredienteInterface;
import modelo.IngredienteDTO;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MedidaDTO;
import modelo.TipoIngrediente;

public class ingredienteDAO implements IngredienteInterface {

    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<IngredienteDTO> lista = new ArrayList<>();
    IngredienteDTO i;
    MedidaDTO m;
    ArrayList<MedidaDTO> listaM = new ArrayList<>();

    //Para acceder al tipo de ingrediente
    TipoIngrediente ti;
    tipoIngredienteDAO tid = new tipoIngredienteDAO();

    MedidaDTO mD;
    MedidaDAO mDao = new MedidaDAO();

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

    public int obtenerIdIngrediente(String nomIngre) {
        int idIngrediente = -1;
        try {
            String sql = "SELECT idIngrediente FROM ingredientes WHERE Nombre = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nomIngre); // Use prepared statement to avoid SQL injection
            rs = ps.executeQuery();
            if (rs.next()) {
                idIngrediente = rs.getInt("idIngrediente");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idIngrediente;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from ingredientes where idIngrediente = " + codigo;
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
            while (rs.next()) {
                i = new IngredienteDTO();
                i.setId(rs.getInt("idIngrediente"));
                i.setNombre(rs.getString("Nombre"));
                //Para el tipo de ingrediente
                String cti = rs.getString("Tipo_Ingrediente_idTipo");
                ti = tid.listarUno(cti);
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
            String sql = "select idIngrediente,Nombre from ingredientes where idIngrediente='" + codigo + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
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
    public ArrayList<IngredienteDTO> listaIngrexTipo(int id) {
        try {
            conn = con.getConexion();
            String sql = "{call  obtenerIngredientesPorTipo(?)}";
            CallableStatement st = conn.prepareCall(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                i = new IngredienteDTO();
                i.setNombre(rs.getString("Nombre"));
                lista.add(i);
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public ArrayList<MedidaDTO> listarMedidaxIngred(String nom, String tipo) {
        ArrayList<MedidaDTO> lista = new ArrayList<>();

        try (Connection conn = con.getConexion(); CallableStatement st = conn.prepareCall("{ CALL obtenerMedidaPorNombreIngredienteYTipo(?,?)}")) {

            st.setString(1, nom);
            st.setString(2, tipo);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    MedidaDTO m = new MedidaDTO();
                    m.setNombre(rs.getString("NombreMedida")); // Usar el alias correcto
                    lista.add(m);  // Agregar a la lista correcta
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    //metodo de yosselin
    public boolean agregar(String nombre, String nomTipo, String nomMedida) {
        int idTipo = -1;
        int idMedida = -1;

        try {
            conn = con.getConexion();

            // Obtener idTipo basado en el nombre
            String sqlIngrediente = "SELECT idTipo FROM tipo_ingrediente WHERE Nombre = ?";
            ps = conn.prepareStatement(sqlIngrediente);
            ps.setString(1, nomTipo);
            rs = ps.executeQuery();
            if (rs.next()) {
                idTipo = rs.getInt("idTipo");
            } else {
                System.out.println("Tipo no encontrado: " + nomTipo);
                return false;
            }
            rs.close();
            ps.close();

            // Obtener idMedida basado en el nombre
            String sqlMedida = "SELECT idMedida FROM medida WHERE Nombre = ?";
            ps = conn.prepareStatement(sqlMedida);
            ps.setString(1, nomMedida);
            rs = ps.executeQuery();
            if (rs.next()) {
                idMedida = rs.getInt("idMedida");
            } else {
                System.out.println("Medida no encontrada: " + nomMedida);
                return false;
            }
            rs.close();
            ps.close();

            // Insertar el nuevo ingrediente
            String sql = "INSERT INTO ingredientes (Nombre, Tipo_Ingrediente_idTipo, idMedida) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, idTipo);
            ps.setInt(3, idMedida);
            ps.executeUpdate();

            return true; // Retorna true si la inserción fue exitosa

        } catch (SQLException ex) {
            Logger.getLogger(ingredienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
