package com.qa.animal;

public class Dog extends Animal {
	
	protected Dog(String faveFood, boolean hasFur, int height) {
		super(faveFood, hasFur, height);
		
	}

	protected boolean isFluffy = true;
	protected String sound = "Bark!";
	
	public void dogSound() {
		System.out.println(sound);
	}

}
