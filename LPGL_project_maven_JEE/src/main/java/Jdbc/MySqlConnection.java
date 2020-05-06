package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/project_joyeux";
	private static String login = "root";
	private static String password = "7RsVDDxnY2lxGuec1vF6";
	Connection cn = null;
	
	MySqlConnection(){
		try
		{
			cn = DriverManager.getConnection(url, login, password);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
