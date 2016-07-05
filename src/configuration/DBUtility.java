package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	final private static String URL="jdbc:postgresql://localhost:5432/servlet";
	public static Connection  conn = null;
	
	private DBUtility(){}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Properties p = new Properties();
		p.setProperty("user", "postgres");
		p.setProperty("password", "123");

		if(conn == null)
		{
			conn = DriverManager.getConnection(URL,p);
		}
		return conn;
	}

}
