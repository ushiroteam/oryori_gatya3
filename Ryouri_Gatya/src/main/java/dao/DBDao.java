package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.GachaDB;
import manager.DBmanager;

public class DBDao {
	
	public static List<GachaDB> UpdateGacha(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		List<GachaDB> list = new ArrayList<>();
		String SQL ="INSET INTO category? VALUES ( ?, ? );";
		try {
			connection = DBmanager.getConnection();
			
			try (PreparedStatement statement= connection.prepareStatement(SQL)){
				resultSet = statement.executeQuery();
				
				resultSet.next();
			
				GachaDB db = new GachaDB();
					statement.setString(0, "");
					statement.setString(1, "");
				
			
			list.add(db);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			
		}
		
		
		return list;
	}
}
