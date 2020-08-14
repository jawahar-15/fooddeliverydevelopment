package com.fooddelivery.development.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fooddelivery.development.dao.RestaurantDao;
import com.fooddelivery.development.model.FoodEntity;
import com.fooddelivery.development.model.OrderEntity;
import com.fooddelivery.development.model.UserEntity;

public class RestaurantDaoImpl implements RestaurantDao {

	
	@Override
	public FoodEntity getFoodByRatingAndprice(int rating, int price) {
		// Select food from Restaurant where restaurant.rating= rating and restaurant.price = price
	FoodEntity foodEntity = new FoodEntity();
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Food1");
		arrayList.add("Food2");
		arrayList.add("Food3");
		arrayList.add("Food4");
		arrayList.add("Food5");
		arrayList.add("Food6");
		foodEntity.setFood(arrayList);
		foodEntity.setDestination("Chennai- Sholinganallur");
		foodEntity.setQuantity(6);
		foodEntity.setFoodId(Long.valueOf(UUID.randomUUID().toString()));
		return foodEntity;
	}

	@Override
	public FoodEntity getFoodByDestination(String destination) {
		// // Select food from Restaurant where restaurant.destination= destination
		FoodEntity foodEntity = new FoodEntity();
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Food1");
		arrayList.add("Food2");
		arrayList.add("Food3");
		arrayList.add("Food4");
		arrayList.add("Food5");
		arrayList.add("Food6");
		foodEntity.setFood(arrayList);
		foodEntity.setDestination("Chennai- Thuraippakkam");
		foodEntity.setQuantity(6);
		foodEntity.setFoodId(Long.valueOf(UUID.randomUUID().toString()));
		return foodEntity;
	}

	@Override
	public FoodEntity getFood(OrderEntity order) {
		// Select Food from Restaurant where restaurant.food= order.food , restaurant.dest = order.destination..
		FoodEntity foodEntity = new FoodEntity();
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Food1");
		arrayList.add("Food2");
		arrayList.add("Food3");
		arrayList.add("Food4");
		arrayList.add("Food5");
		arrayList.add("Food6");
		foodEntity.setFood(arrayList);
		foodEntity.setDestination("Chennai- Sholinganallur");
		foodEntity.setQuantity(6);
		foodEntity.setFoodId(Long.valueOf(UUID.randomUUID().toString()));
		return foodEntity;
	}

	@Override
	public int totalOrdersTaken() {
		// Select 1500 - restaurant.totalOrdersTaken from the restaurant.
		return 10;
	}

	@Override
	public List<Integer> createOrderRequest(UserEntity userEntity, FoodEntity foodEntity) {
		// Insert into Order where food.id= food , user values
		List<Integer> insertedIntegers=new ArrayList<>(); 
		return insertedIntegers; 
	}

	@Override
	public int updateOrderRequest(OrderEntity orderEntity) {
		// update ORder where order.food = orderEntity.food
		
		//updatedOrderId
		
		return 10;
	}

	@Override
	public int deleteOrderRequest(OrderEntity orderEntity) {
		// TODO Auto-generated method stub
		// Delete order from ORDER where order.id = orderntity.Id;
		
		// return deletedORderId
		return 0;
	}

}
