package com.qa.animal;

public class Animal implements Exists, LivingThing{
	protected String faveFood = "Terry's Chocolate Orange";
	protected boolean hasFur = true;
	protected int height = 0;
	
	protected Animal(String faveFood, boolean hasFur, int height) {
		this.faveFood = faveFood;
		this.hasFur = hasFur;
		this.height = height;
	}
	
	public void eat() {
		System.out.println("Please feed me more chocolate orange");
	}
	
	public void getOnArk() {
		System.out.println("Go in two by two");
	}

	@Override
	public void growing() {
		height++;
		
	}

	@Override
	public void onEarth() {
		System.out.println("Animal is on earth");
		
	}

	@Override
	public void hasMatter() {
		System.out.println("This Animal has matter");
		
	}
	
}
