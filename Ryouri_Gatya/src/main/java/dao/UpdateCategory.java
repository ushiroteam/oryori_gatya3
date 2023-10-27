package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Category;
import manager.DBmanager;

public class UpdateCategory {

	public static List<Category> Updatefirst() {

		Connection connection = null;
		ResultSet resultSet = null;
		List<Category> list1 = new ArrayList<>();
//		Scanner scan = new Scanner("");
//		List<Ryouri> list2 = new ArrayList<>();
//		List<Recipe> list3 = new ArrayList<>();
//		List<Restaurant> list4 = new ArrayList<>();
		String SQL1 = "INSERT INTO category? VALUES ( ?, ? );";
//		String SQL2 ="INSERT INTO ryouri? VALUES (?,?,?,?);";
//		String SQL3 ="INSERT INTO recipe? VALUES (?,?,?);";
//		String SQL4 ="INSERT INTO restaurant? VALUES (?,?,?,?);";

		try {
			connection = DBmanager.getConnection();

			try (PreparedStatement statement = connection.prepareStatement(SQL1)) {

				resultSet = statement.executeQuery();
				resultSet.next();

				Category db1 = new Category();
				statement.setString(0, "");
				statement.setString(1, "");

				list1.add(db1);

			} catch (SQLException ex1) {
				ex1.printStackTrace();
			}

//			try(PreparedStatement statement = connection.prepareStatement(SQL2)){
//				
//				resultSet = statement.executeQuery();
//				resultSet.next();
//				
//				Ryouri db2 = new Ryouri();
//				statement.setString(0, "");
//				statement.setString(1, "");
//				statement.setString(3, "");
//				statement.setString(4, "");
//				
//			list2.add(db2);
//				
//			}catch(SQLException ex2) {
//				ex2.printStackTrace();
//			}
//			
//			try(PreparedStatement statement = connection.prepareStatement(SQL3)){
//				
//				resultSet = statement.executeQuery();
//				resultSet.next();
//				
//				Recipe db3 = new Recipe();
//				statement.setString(0, "");
//				statement.setString(1, "");
//				statement.setString(3, "");
//				
//			list3.add(db3);
//				
//			}catch(SQLException ex3) {
//				ex3.printStackTrace();
//			}
//			
//			try(PreparedStatement statement = connection.prepareStatement(SQL4)){
//				
//				resultSet = statement.executeQuery();
//				resultSet.next();
//				
//				Restaurant db4 = new Restaurant();
//				statement.setString(0, "");
//				statement.setString(1, "");
//				statement.setString(3, "");
//				statement.setString(4, "");
//			
//			list4.add(db4);
//				
//			}catch(SQLException ex4) {
//				ex4.printStackTrace();
//			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

		}

		return list1;
	}
}
