package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.GatyaUser;
import manager.DBmanager;

public class Dao {
	
	public static List<GatyaUser> selectryouri(){
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		List<GatyaUser> list = null;
		
		try {
			connection = DBmanager.getConnection();
			String SQL = "SELECT C.ryouriID,C.genreid,C.imgURL,C.dishes,A.dishes_genre,B.recipeURL,D.imgURL,D.restaurantURL FROM category AS A LEFT JOIN recipe AS B ON A.genreID= B.genreID LEFT JOIN ryouri AS C ON B.ryouriID= C.ryouriID LEFT JOIN ryouri AS C ON C.ryouriID= D.ryouriID LEFT JOIN restaurant AS D ON C.ryouriID = D.ryouriID order by RAND() LIMIT 1;";
			
			statement = connection.prepareStatement(SQL);
			resultSet = statement.executeQuery();
			
			list = new ArrayList<>();
			while(resultSet.next()) {
				GatyaUser user = new GatyaUser();
					user.setRyouriID(resultSet.getNString("C.ryouriID"));
					user.setGenreID(resultSet.getNString("C.genreID"));
					user.setRyouri_imgURL(resultSet.getNString("C.imgURL"));
					user.setDishes(resultSet.getNString("C.dishes"));
					user.setDishes_genre(resultSet.getNString("A.dishes_genre"));
					user.setRecipeURL(resultSet.getNString("B.recipeURL"));
					user.setRestaurant_imgURL(resultSet.getNString("D.imgURL"));
					user.setRestaurantURL(resultSet.getNString("restaurantURL"));
				list.add(user);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
    	}finally {
		DBmanager.close(resultSet);
		DBmanager.close(statement);
		DBmanager.close(connection);
	}
		
		return list;
	}
}
