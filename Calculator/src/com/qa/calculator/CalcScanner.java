package com.qa.calculator;

import java.util.Scanner;

public class CalcScanner {
	
	public static int userInput() {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		int userNumber = myScanner.nextInt();
		
		return userNumber;

	}
	
	
}
