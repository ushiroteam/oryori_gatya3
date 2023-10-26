package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Restaurant;
import manager.DBmanager;

public class UpdateRestaurant {

	public static List<Restaurant> Updatefourth() {

		Connection connection = null;
		ResultSet resultSet = null;
		List<Restaurant> list4 = new ArrayList<>();
		String SQL4 = "INSERT INTO restaurant? VALUES (?,?,?,?);";

		try {
			connection = DBmanager.getConnection();

			try (PreparedStatement statement = connection.prepareStatement(SQL4)) {

				resultSet = statement.executeQuery();
				resultSet.next();

				Restaurant db4 = new Restaurant();
				statement.setString(0, "");
				statement.setString(1, "");
				statement.setString(3, "");
				statement.setString(4, "");

				list4.add(db4);

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return list4;

	}
}
