package com.qa.calculator;

public class Main {

	public static void main(String[] args) {
		CalcScanner inputOne = new CalcScanner();
		CalcScanner inputTwo = new CalcScanner();
		CalculatorMethods myCalculator = new CalculatorMethods();
		
		
//		System.out.println(myCalculator.addition(inputOne.userInput(), inputTwo.userInput()));
		System.out.println(myCalculator.division(inputOne.userInput(), inputTwo.userInput()));
		
//		System.out.println(myInput.mathType(inputOne.userInput(), inputTwo.userInput()));
	}

}
