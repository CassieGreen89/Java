package com.qa.classmembers;

import java.util.Objects;

public class Customer {
	private String firstName;
	private String lastName;
	private static int numberOfPeople;
	
	protected Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfPeople ++;
	}
	protected Customer(String firstName) {
		this.firstName = firstName;
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

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
}
