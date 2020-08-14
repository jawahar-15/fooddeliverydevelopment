package com.fooddelivery.development.model;

import java.util.List;

public class FoodEntity {

	public FoodEntity() {
		
	}
	
	public FoodEntity(long foodId, List<String> food, String destination, int quantity) {
		super();
		this.foodId = foodId;
		this.food = food;
		this.destination = destination;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodEntity [foodId=" + foodId + ", food=" + food + ", destination=" + destination + ", quantity="
				+ quantity + "]";
	}

	public long getFoodId() {
		return foodId;
	}

	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}

	public List<String> getFood() {
		return food;
	}

	public void setFood(List<String> food) {
		this.food = food;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long foodId;
	
	public List<String> food;
	
	public String destination;
	
	public int quantity;
	
}
