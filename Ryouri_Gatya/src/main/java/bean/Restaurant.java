package bean;

import java.io.Serializable;

public class Restaurant implements Serializable{

	private String ryouriID;
	private String genreID;
	private String restaurant_imgURL;
	private String restaurantURL;

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

	public String getRestaurant_imgURL() {
		return restaurant_imgURL;
	}

	public void setRestaurant_imgURL(String restaurant_imgURL) {
		this.restaurant_imgURL = restaurant_imgURL;
	}

	public String getRestaurantURL() {
		return restaurantURL;
	}

	public void setRestaurantURL(String restaurantURL) {
		this.restaurantURL = restaurantURL;
	}
}
