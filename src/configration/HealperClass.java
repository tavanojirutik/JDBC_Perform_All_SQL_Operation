package configration;

import java.sql.*;

public class HealperClass {
	
	String url ="jdbc:mysql://localhost:3306/students";
	String username = "root";
	String password = "root";
	
	Connection connection = null;
	
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	
}
