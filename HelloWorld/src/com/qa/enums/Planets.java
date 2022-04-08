package com.qa.enums;

public enum Planets {
	
	MERCURY("Red"), VENUS("Yellow"), MARS("Red"), EARTH("Green and Blue");
	
	private final String colour;
	
	Planets(String colour) {
		this.colour = colour;
	}
	
