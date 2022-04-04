package com.qa.garage;

public class Lorry extends Vehicle{
	protected String goodsType;
	
	protected Lorry(int idNumber, String vehicleType, String goodstype) {
		super(idNumber, vehicleType);
		this.goodsType = goodsType;
	}
				
	protected int cost = 8000;
	protected int wheelCount = 5;
	protected String vehicleType = "Lorry";
}
