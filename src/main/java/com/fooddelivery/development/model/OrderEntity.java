package com.fooddelivery.development.model;

import java.util.List;


public class OrderEntity {

	public long orderId;
	
	public StatusEnum status;
	
	public List<String> foodItems;
	
	public String destination;
	
	public int quantity;
	
	public int rating;
	
	public OrderEntity(long orderId, StatusEnum status, List<String> foodItems, String destination, int quantity,
			int rating, int price) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.foodItems = foodItems;
		this.destination = destination;
		this.quantity = quantity;
		this.rating = rating;
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int price;

	public OrderEntity(long orderId, StatusEnum status, List<String> foodItems, String destination, int quantity,
			int price) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.foodItems = foodItems;
		this.destination = destination;
		this.quantity = quantity;
		this.price = price;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public List<String> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<String> foodItems) {
		this.foodItems = foodItems;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", status=" + status + ", foodItems=" + foodItems + ", destination="
				+ destination + ", quantity=" + quantity + ", rating=" + rating + ", price=" + price + "]";
	}
	
}
