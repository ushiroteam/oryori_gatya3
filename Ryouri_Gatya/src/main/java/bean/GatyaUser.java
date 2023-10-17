package bean;

import java.io.Serializable;

public class GatyaUser implements Serializable {

	private String ryouriID;
	private String genreID;
	private String ryouri_imgURL;
	private String dishes;
	private String dishes_genre;
	private String recipeURL;
	private String restaurant_imgURL;
	private String restaurantURL;

//	public GatyaUser(String ryouriID, String genreID, String imgURL, String dishes, String dishes_genre,
//			String recipeURL) {
//		this.ryouriID = ryouriID;
//		this.genreID = genreID;
//		this.imgURL = imgURL;
//		this.dishes = dishes;
//		this.dishes_genre = dishes_genre;
//		this.recipeURL = recipeURL;
//	}

	public String getRyouriID() {
		return ryouriID;
	}

	public void setRyouriID(String ryouriID) {
		this.ryouriID = ryouriID;
	}

	public String getGenreID() {
		return genreID;
	}

	public void setGenreID(String genreID) {
		this.genreID = genreID;
	}

	public String getRyouri_imgURL() {
		return ryouri_imgURL;
	}

	public void setRyouri_imgURL(String ryouri_imgURL) {
		this.ryouri_imgURL = ryouri_imgURL;
	}

	public String getDishes() {
		return dishes;
	}

	public void setDishes(String dishes) {
		this.dishes = dishes;
	}

	public String getDishes_genre() {
		return dishes_genre;
	}

	public void setDishes_genre(String dishes_genre) {
		this.dishes_genre = dishes_genre;
	}

	public String getRecipeURL() {
		return recipeURL;
	}

	public void setRecipeURL(String recipeURL) {
		this.recipeURL = recipeURL;
	}

	public String getRestaurantURL() {
		return restaurantURL;
	}

	public void setRestaurantURL(String restaurantURL) {
		this.restaurantURL = restaurantURL;
	}

	public String getRestaurant_imgURL() {
		return restaurant_imgURL;
	}

	public void setRestaurant_imgURL(String restaurant_imgURL) {
		this.restaurant_imgURL = restaurant_imgURL;
	}

}
