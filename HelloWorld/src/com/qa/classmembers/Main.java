package com.qa.classmembers;

public class Main {
	public static void main(String[] args) {
		Customer firstCustomer = new Customer("Sam", "Samson");
		Customer secondCustomer = new Customer("John", "Johnson");
		Customer thirdCustomer = new Customer("Fred", "Fredson");
		Customer thirdCustomer2 = new Customer("Fred", "Fredson");

		firstCustomer.setFirstName("Samwise");
		secondCustomer.setFirstName("Johnny");

		System.out.println(firstCustomer.getLastName());
		System.out.println(secondCustomer.getFirstName());
		System.out.println(firstCustomer.getNumberOfPeople());
		System.out.println(secondCustomer.getNumberOfPeople());
		System.out.println(thirdCustomer.equals(thirdCustomer2));

		Trees oakTree = new Trees(15, 487);
		Trees ashTree = new Trees(30, 5928);

		oakTree.setHeight(17);
		ashTree.setNumberOfLeaves(6741);

		System.out.println(oakTree.getNumberOfLeaves());
		
	}
}
