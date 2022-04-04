package com.qa.garage;

public class Motorbike extends Vehicle{
	protected int wheels;
	
	protected Motorbike(int idNumber, String vehicleType, int wheels) {
		super(idNumber, vehicleType);
		this.wheels = wheels;
	}
	protected int cost = 6000;
	protected int wheelCount = 2;
	protected String vehicleType = "Motorbike";
}
