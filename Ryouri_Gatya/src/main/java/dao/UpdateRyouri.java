package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Ryouri;
import manager.DBmanager;

public class UpdateRyouri {

	public static List<Ryouri> Updatesecond() {
		Connection connection = null;
		ResultSet resultSet = null;
		List<Ryouri> list2 = new ArrayList<>();

		String SQL2 = "INSERT INTO ryouri? VALUES (?,?,?,?);";

		try {
			connection = DBmanager.getConnection();

			try (PreparedStatement statement = connection.prepareStatement(SQL2)) {

				resultSet = statement.executeQuery();
				resultSet.next();

				Ryouri db2 = new Ryouri();
				statement.setString(0, "");
				statement.setString(1, "");
				statement.setString(2, "");
				statement.setString(3, "");

				list2.add(db2);

			} catch (SQLException ex1) {
				ex1.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return list2;
	}
}
