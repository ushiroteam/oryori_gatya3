package bean;

import java.io.Serializable;

public class Ryouri implements Serializable{

	private String ryouriID;
	private String genreID;
	private String ryouri_imgURL;
	private String dishes;

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

}
