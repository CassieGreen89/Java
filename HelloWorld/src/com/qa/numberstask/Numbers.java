package com.qa.numberstask;


//Create a method that takes a number 10-99, and adds the two digits together 
//for example 74 = 7 + 4 = 11.
//Create a second method that when given the number 1-99 returns a String representation 
//of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//Expand on the method you wrote in step 2 to allow the input 1-999.
//Expand the method you wrote in step 2 to allow the input 1-9999.
//Use a for()-loop to print the numbers 1-100 in words.
//For example; 1 = one, 100 = one hundred.


public class Numbers {

	
	public static void numberAdder(int myNumber) {
		if(myNumber > 10 && myNumber < 99) {
			String numStr = Integer.toString(myNumber);
			char[] arr = numStr.toCharArray();	
			char numOne = arr[0];
			char numTwo = arr[1];
			int output = Character.getNumericValue(numOne) + Character.getNumericValue(numTwo);
			System.out.println(output);
		}
		else {
			System.out.println("Number must be bigger than 10 and less than 99");
		}
	}
	
// if else to find length of number
// if under 20 - use input - 1 to access the right index in the array
// if over 20, do first char = twenty + second char 

	

	
}
