package com.qa.calculator;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class CalculatorMethods {

	public double addition(double numOne, double numTwo) {
		return numOne += numTwo;
	}

	public double multiplication(double numOne, double numTwo) {
		return numOne * numTwo;
	}

	public double subtraction(double numOne, double numTwo) {
		return numOne - numTwo;
	}

	public double division(double numOne, double numTwo) {
		double myOutput = 0;
		if (numOne > numTwo) {
			myOutput = numOne / numTwo;
			return myOutput;
		} else {
			System.out.println("Not valid");
			return 0;

		}

	}
}
