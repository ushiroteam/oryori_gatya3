package bean;

import java.io.Serializable;

public class Recipe implements Serializable{

	private String ryouriID;
	private String genreID;
	private String recipeURL;

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

	public String getRecipeURL() {
		return recipeURL;
	}

	public void setRecipeURL(String recipeURL) {
		this.recipeURL = recipeURL;
	}

}
