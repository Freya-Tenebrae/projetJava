package SGBDConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/project_joyeux";
	private static String login = "root";
	private static String password = "7RsVDDxnY2lxGuec1vF6";
	public static Connection cn;
	
	public static Connection getInstance() {
		try
		{
			cn = DriverManager.getConnection(url, login, password);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	return cn;
	}

}
