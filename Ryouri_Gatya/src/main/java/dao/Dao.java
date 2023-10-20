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
			String SQL = "SELECT C.ryouriID,C.genreid,C.ryouri_imgURL,C.dishes,A.dishes_genre,B.recipeURL,D.restaurant_imgURL,D.restaurantURL FROM category AS A LEFT JOIN recipe AS B ON A.genreID= B.genreID LEFT JOIN ryouri AS C ON B.ryouriID= C.ryouriID LEFT JOIN restaurant AS D ON C.ryouriID = D.ryouriID order by RAND() LIMIT 1;";
			System.out.println("a");
			
			statement = connection.prepareStatement(SQL);
			System.out.println("b");
			resultSet = statement.executeQuery();
			System.out.println("c");
			list = new ArrayList<>();
			resultSet.next();
				GatyaUser user = new GatyaUser();
					user.setRyouriID(resultSet.getNString("C.ryouriID"));
					System.out.println(resultSet.getNString("C.ryouriID"));
					user.setGenreID(resultSet.getNString("C.genreID"));
					System.out.println(resultSet.getNString("C.genreID"));
					user.setRyouri_imgURL(resultSet.getNString("C.ryouri_imgURL"));
					System.out.println(resultSet.getNString("C.ryouri_imgURL"));
					user.setDishes(resultSet.getNString("C.dishes"));
					user.setDishes_genre(resultSet.getNString("A.dishes_genre"));
					user.setRecipeURL(resultSet.getNString("B.recipeURL"));
					user.setRestaurant_imgURL(resultSet.getNString("D.restaurant_imgURL"));
					user.setRestaurantURL(resultSet.getNString("D.restaurantURL"));
				list.add(user);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
    	}finally {
		DBmanager.close(resultSet);
		DBmanager.close(statement);
		DBmanager.close(connection);
	}
		
		return list;
	}
}
