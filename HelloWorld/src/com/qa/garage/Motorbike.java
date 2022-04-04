package com.qa.garage;

public class Motorbike extends Vehicle{
	
	protected Motorbike(String sound, boolean drives) {
		super(sound, drives);
	}
	protected int cost = 6000;
	protected int wheelCount = 2;
	protected String vehicleType = "Motorbike";
}
