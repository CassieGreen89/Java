package com.qa.garage;

public class Lorry extends Vehicle{
	
	protected Lorry(String sound, boolean drives) {
		super(sound, drives);
	}
				
	protected int cost = 8000;
	protected int wheelCount = 5;
	protected String vehicleType = "Lorry";
}
