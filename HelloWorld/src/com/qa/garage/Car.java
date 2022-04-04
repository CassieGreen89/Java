package com.qa.garage;

import com.qa.garage.Vehicle;

public class Car extends Vehicle{
	
	protected Car(String sound, boolean drives) {
		super(sound, drives);
		
	}
	protected int cost = 8000;
	protected int wheelCount = 4;
	protected String vehicleType = "Car";

}
