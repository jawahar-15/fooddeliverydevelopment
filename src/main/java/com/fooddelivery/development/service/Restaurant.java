package com.fooddelivery.development.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import javax.persistence.criteria.Order;

import org.apache.catalina.User;

import com.fooddelivery.development.model.FoodEntity;
import com.fooddelivery.development.model.OrderEntity;
import com.fooddelivery.development.model.UserEntity;

public interface Restaurant {

	/**
	 * getFoodByRatingAndprice is used to filter fooditems by user given Rating and price.
	 * @return List of Food items
	 */
	public FoodEntity getFoodByRatingAndprice(int rating , int price);
	
	/**
	 * getFoodByDestination is used to filter food by user given Destination.
	 * 
	 * @return List of Food items.
	 */
	public FoodEntity getFoodByDestination(String destination);
	
	/**
	 * getFood method is used to get Food from the common user without filters.
	 * @return
	 */
	public FoodEntity getFood(OrderEntity orderEntity);
	
	/**
	 * totalAllocatedOrders is used to calculate Total  Allocated Orders Per day
	 * @return
	 */
	public int totalAllocatedOrders();
	
	/**
	 * totalOrdersTaken is used to calculate Total Orders Completed per day.
	 * @return
	 */
	public int totalOrdersTaken();
	
	/**
	 *  Create opeartion in Crud
	 * @param userEntity
	 * @param foodEntity
	 * @return
	 */
	public List<Integer> createOrderRequest(UserEntity userEntity, FoodEntity foodEntity);

	/**
	 *  Update opeartion in Crud
	 * @param userEntity
	 * @param foodEntity
	 * @return
	 */
	public int updateOrderRequest(OrderEntity orderEntity);

	/**
	 *  Delete opeartion in Crud
	 * @param userEntity
	 * @param foodEntity
	 * @return
	 */
	public int deleteOrderRequest(OrderEntity orderEntity);

	/**
	 * to check if the restaurant is open to receive orders
	 * @return
	 */
	public boolean isOpen();
}
