package com.qa.datatypes;

public class Exercise {

	public static void main(String[] args) {
		System.out.println(integerPrint(5, 4));
		System.out.println(charPrint('P'));
		System.out.println(floatPrint(0.6f));
		System.out.println(concatenate('a', 'b'));
	}

	public static int integerPrint(int intTwo, int intOne) {
		return intOne + intTwo;	
	}
	
	public static char charPrint(char charOne) {
		return charOne;
	}
	
	public static float floatPrint(float floatOne)
	{	return floatOne;
	}
	
	public static StringBuilder concatenate(char charOne, char charTwo) {
		return new StringBuilder().append(charOne).append(charTwo);
	}
} 