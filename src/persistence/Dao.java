package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	Connection con; //Objeto de Conexão
	PreparedStatement stmt; //Objeto de Transação
	ResultSet rs; //Objeto de Consulta
	
	public void open()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/midia", "root", "root");			
	}
	
	public void close()throws Exception{
		con.close();
	}

}
