package com.qa.arrays;

public class ArrayExercises {

	public static int[] myArray = {1,2,3,4,5};
	
	public static void myArrayLoop() {
		for(int i : myArray) {
			System.out.println(i);
		}
		
	}
	
//	Create a for loop that populates an integer array with values, 
// outputting them at each iteration.
//	Then create another loop that iterates through the array, 
// changing the values at each point to equal itself times 10, 
// outputting them at each iteration.	

	public static int[] arrayTwo = new int[10];
	
	public static void arrayLoopTwo() {
		for(int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = i;
			System.out.println(arrayTwo[i]);
		}
	}

	
	public static void arrayTimesTen() {
		for(int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = i * 10;
			System.out.println(arrayTwo[i]);
		}
	}
	
	
	
}
