/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.TipoIngredienteInterface;
import modelo.MedidaDTO;
import modelo.TipoIngrediente;

/**
 *
 * @author yosse
 */
public class MedidaDAO implements TipoIngredienteInterface{

    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<MedidaDTO> lista = new ArrayList<>(); 
    MedidaDTO ti;
    
    @Override
    public boolean agregar(TipoIngrediente c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(TipoIngrediente c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TipoIngrediente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public MedidaDTO listarUnom(String codigo) {
        try {
            String sql = "select * from medida where idMedida = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ti = new MedidaDTO();
                ti.setIdMedida(rs.getInt("idTipo"));
                ti.setNombre(rs.getString("Nombre"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MedidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ti;
    }
    
     public ArrayList<MedidaDTO> listarMedidaxTipo(String nom) {
    ArrayList<MedidaDTO> lista = new ArrayList<>();
    
    try (Connection conn = con.getConexion();
         CallableStatement st = conn.prepareCall("{ CALL obtenerMedidasPorTipoIngrediente(?)}")) {
        
        st.setString(1, nom);
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

    @Override
    public TipoIngrediente listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
