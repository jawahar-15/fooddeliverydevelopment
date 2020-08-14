package com.fooddelivery.development.model;


public enum StatusEnum {

	ORDERED(1),UPDATED(2),CANCELLED(3);
	
	private int value;
	StatusEnum(int value) {
		this.value= value;
	}
}
