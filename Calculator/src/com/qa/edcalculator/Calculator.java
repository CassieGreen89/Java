package com.qa.edcalculator;

import java.util.Optional;
import java.util.function.Function;

public class Calculator {

	public double addition(double a, double b) {
		return a + b;

	}

	public double subtraction(double a, double b) {
		return a - b;

	}

//	public double div(double a, double b) throws ArithmeticException {
//
//		if (b == 0) {
//
//			throw new ArithmeticException("Can't divide by 0!");
//		} else {
//
//			return a / b;
//		}
//	}
	// optional wrapped null
	// if a user does x, can do y

	public Optional<Double> division(double a, double b) {
		if (b > 0) {
			Double output = a / b;
			return Optional.of(output);
		} else {
			Optional<Double> d = Optional.of(a);
			Optional<Double> c = Optional.of(b);
			Optional<Double> output = Optional.of(d.get() / c.get());			
			return output;
		}

	}
	
//	public void isNull(Optional<Double> a) {
//		if(a.isPresent()) {
//			System.out.println("A is not null!!!");
//		}
//		else {
//			System.out.println("A is null");
//		}
//	}

	public double mult(double a, double b) {
		return a * b;

	}

}
