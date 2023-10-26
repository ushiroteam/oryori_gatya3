package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Recipe;
import manager.DBmanager;

public class UpdateRecipe {

	public static List<Recipe> Updatethird() {

		Connection connection = null;
		ResultSet resultSet = null;
		List<Recipe> list3 = new ArrayList<>();
		String SQL3 = "INSERT INTO recipe? VALUES (?,?,?);";

		try {
			connection = DBmanager.getConnection();
			
			try(PreparedStatement statement = connection.prepareStatement(SQL3)){
				
				resultSet = statement.executeQuery();
				resultSet.next();
				
				Recipe db3 = new Recipe();
				statement.setString(0, "");
				statement.setString(1, "");
				statement.setString(3, "");
				
			list3.add(db3);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return list3;
	}
}
