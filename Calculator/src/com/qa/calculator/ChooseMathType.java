package com.qa.calculator;

import java.util.Scanner;

public class ChooseMathType {
	
	public static String mathType() {
		Scanner myScanner = new Scanner(System.in);
		CalculatorMethods myCalculator = new CalculatorMethods();
		
		System.out.println("Choose math type: add, multiply, subtract, divide");
		String mathType = myScanner.nextLine();
		
		return mathType;
		
		}
	}
