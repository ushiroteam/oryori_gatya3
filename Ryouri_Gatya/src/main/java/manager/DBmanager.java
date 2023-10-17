package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBmanager {

	private static final String DRIVER_NAME = "org.mariadb.jdbc.Driver";
	
	private static final String DB_URL = "jdbc:mariadb://localhost:3306/ryourigatyadb";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(DRIVER_NAME);
		Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
		
		
		return connection;
	}
	
	public static void close(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close (PreparedStatement statement) {
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet resultSet) {
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
