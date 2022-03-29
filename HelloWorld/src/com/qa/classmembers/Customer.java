package com.qa.classmembers;

public class Customer {
	private String firstName;
	private String lastName;
	private static int numberOfPeople;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfPeople ++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static int getNumberOfPeople() {
		return numberOfPeople;
	}

	public static void setNumberOfPeople(int numberOfPeople) {
		Customer.numberOfPeople = numberOfPeople;
	}
}
