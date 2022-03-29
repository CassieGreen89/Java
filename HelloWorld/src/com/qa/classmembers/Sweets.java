package com.qa.classmembers;

public class Sweets {
	private int sugarLevel;
	private String descriptor;
	private static int numberOfSweets;
	
	public void SweetName(int sugarLevel, String descriptor) {
		this.sugarLevel = sugarLevel;
		this.descriptor = descriptor;
		this.numberOfSweets++;				
	}
	

	
}
