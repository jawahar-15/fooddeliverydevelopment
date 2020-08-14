package com.fooddelivery.development.model;

import java.util.List;

public class UserEntity {

	public String userName;
	
	public String userId;
	
	public String address;
	
	public String quantity;
	
	public List<FoodEntity> foodOrdered;

	public UserEntity() {
		
	}
	
	public UserEntity(String userName, String userId, String address, String quantity, List<FoodEntity> foodOrdered) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.address = address;
		this.quantity = quantity;
		this.foodOrdered = foodOrdered;
	}

	@Override
	public String toString() {
		return "UserEntity [userName=" + userName + ", userId=" + userId + ", address=" + address + ", quantity="
				+ quantity + ", foodOrdered=" + foodOrdered + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<FoodEntity> getFoodOrdered() {
		return foodOrdered;
	}

	public void setFoodOrdered(List<FoodEntity> foodOrdered) {
		this.foodOrdered = foodOrdered;
	}
	
	
}
