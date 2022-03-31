package com.qa.animal;

public class Cat extends Animal{
	
	protected Cat(String faveFood, boolean hasFur, int height) {
		super(faveFood, hasFur, height);
	}

	protected String sound = "Miaow";
			
	public void catSound() {
		System.out.println(sound);
	}

}
