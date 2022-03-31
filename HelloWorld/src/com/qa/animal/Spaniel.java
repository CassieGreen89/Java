package com.qa.animal;

public class Spaniel extends Animal {
	
	protected Spaniel(String faveFood, boolean hasFur, int height) {
		super(faveFood, hasFur, height);
		// TODO Auto-generated constructor stub
	}

	protected boolean isChaotic = true;
	
	public void favouriteGame()	{
		System.out.println("Spaniels enjoy playing fetch");
	}
			

}
