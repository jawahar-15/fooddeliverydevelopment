package com.fooddelivery.development.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fooddelivery.development.dao.RestaurantDao;
import com.fooddelivery.development.model.FoodEntity;
import com.fooddelivery.development.model.OrderEntity;
import com.fooddelivery.development.model.UserEntity;
import com.fooddelivery.development.service.Restaurant;

public class RestaurantFourImpl implements  Restaurant{

	private static final int TOTAL_ORDERS_PER_DAY = 2000;
	
	@Autowired 
	RestaurantDao restaurantDao;
	
	@Override
	public FoodEntity getFoodByRatingAndprice(int rating, int price) {
		return restaurantDao.getFoodByRatingAndprice(rating, price);
	}

	@Override
	public FoodEntity getFoodByDestination(String destination) {
		return restaurantDao.getFoodByDestination(destination);
	}

	@Override
	public FoodEntity getFood(OrderEntity order) {
			return restaurantDao.getFood(order);
}

	@Override
	public int totalAllocatedOrders() {
		return TOTAL_ORDERS_PER_DAY;
	}
	
	@Override
	public int totalOrdersTaken() {
		return restaurantDao.totalOrdersTaken();
	}

	@Override
	public List<Integer> createOrderRequest(UserEntity userEntity, FoodEntity foodEntity) {
		return restaurantDao.createOrderRequest(userEntity, foodEntity);
	}

	@Override
	public int updateOrderRequest(OrderEntity orderEntity) {
		return restaurantDao.updateOrderRequest(orderEntity);
	}

	@Override
	public int deleteOrderRequest(OrderEntity orderEntity) {
		return restaurantDao.deleteOrderRequest(orderEntity);
	}

	@Override
	public boolean isOpen() {
		return false;
	}

}
