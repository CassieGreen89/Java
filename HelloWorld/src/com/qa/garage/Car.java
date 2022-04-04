package com.qa.garage;

import com.qa.garage.Vehicle;

public class Car extends Vehicle{
	protected boolean tooFastTooFurious;
	
	protected Car(int idNumber, String vehicleType, boolean tooFastTooFurious) {
		super(idNumber, vehicleType);
		this.tooFastTooFurious = tooFastTooFurious;
	}
	protected int cost = 8000;
	protected int wheelCount = 4;
	protected String vehicleType = "Car";

	public int getCost() {
		return cost;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}
