package bean;

import java.io.Serializable;

public class Category implements Serializable {

	private String genreID;
	private String dishes_genre;

	public String getGenreID() {
		return genreID;
	}

	public void setGenreID(String genreID) {
		this.genreID = genreID;
	}

	public String getDishes_genre() {
		return dishes_genre;
	}

	public void setDishes_genre(String dishes_genre) {
		this.dishes_genre = dishes_genre;
	}

}
