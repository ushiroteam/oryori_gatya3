package bean;

import java.io.Serializable;

public class GachaDB implements Serializable {

	private String category;
	private String ryouri;
	private String recipe;
	private String restaurant;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRyouri() {
		return ryouri;
	}

	public void setRyouri(String ryouri) {
		this.ryouri = ryouri;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
}
