package com.qa.enums;

public enum Planets {
	
	MERCURY("Red"), VENUS("Yellow"), MARS("Red"), EARTH("Green and Blue");
	
	private final String colour;
	
	Planets(String colour) {
		this.colour = colour;
	}
	
	public static void main String([] args) {
		forEach(Planet p : Planets.values()) {
			System.out.println("Planet" p "is the colour" Planet.values());
			}
		}
}
