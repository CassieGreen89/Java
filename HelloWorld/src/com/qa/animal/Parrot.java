package com.qa.animal;

public class Parrot extends Animal{
	protected boolean hasFur = false;
	
	protected Parrot(String faveFood, boolean hasFur, int height) {
		super(faveFood, hasFur, height);
		// TODO Auto-generated constructor stub
	}

	public void parrotsFur() {
		if(hasFur = true) {
			System.out.println("Parrots have fur");
		}
		else {
			System.out.println("Parrots don't have fur");
		}
	}

}
