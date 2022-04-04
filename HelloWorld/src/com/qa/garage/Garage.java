package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	    public List<String> garageList = new ArrayList<>();
	    
	    public void addToGarage() {
	    	garageList.add("Car");
	    	garageList.add("Motorbike");
	    	garageList.add("Lorry");
	    	System.out.println(garageList);
	    }

	    public void costCalc() {
	    	for(String vehicle: garageList) {
	    		if(vehicle == "Car") {
	    			System.out.println(vehicle + " price: 8000");
	    		}
	    		else if(vehicle == "Lorry") {
	    			System.out.println(vehicle +  " price: 10000");
	    		}
	    		else if(vehicle == "Motorbike") {
	    			System.out.println(vehicle +  " price: 10000");
	    		}
	    	
	    	}
	    }
}


