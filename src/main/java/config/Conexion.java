package config ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conn;
    
    public static Connection getConexion(){
        Connection con = null;
		try { Class.forName("com.mysql.cj.jdbc.Driver"); 
		String url = "jdbc:mysql://localhost:3306/bdmenu"; 
		String usr = "root";
		String psw = ""; 
		con = DriverManager.getConnection(url,usr,psw); 
		//System.out.println("conexion ok");
		} catch (ClassNotFoundException ex)
		{ System.out.println("No hay Driver!!"); } 
		catch (SQLException ex) { System.out.println("Error con la BD "); }
		return con; 
    }
}