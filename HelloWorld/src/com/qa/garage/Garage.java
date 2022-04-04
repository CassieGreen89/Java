package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	    public List<Vehicle> garageList = new ArrayList<>();
	    
	    public void addToGarage() {
	    	garageList.add(new Car(1, "Car", true));
	    	garageList.add(new Motorbike(2, "Motorbike", 2));
	    	garageList.add(new Lorry(3, "Lorry", "Cabbages"));
	    	System.out.println(garageList);
	    }

	    public void costCalc() {
	    	for(Vehicle Vehicle : garageList) {
	    		if(Car.getVehicleType().equals("Car")) {
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
	    
	    public void addVehicle(String myVehicle) {
	    	garageList.add(myVehicle);
	    	System.out.println(garageList);
	    }
	    
//	    public void removeVehicle(vehicle) {
//	    	garageList.re
//	    }
	    	
	    }


