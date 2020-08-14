package com.altimetrik.ee.demo.entity;


public enum STATUS {

	ORDERED(1),UPDATED(2),CANCELLED(3);
	
	private int value;
	
	public STATUS(int value) {
		this.value= value;
	}
}
