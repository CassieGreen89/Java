package com.qa.edcalculator;

import java.util.Optional;

public class Runner {

	public static void main(String[] abc) throws ArithmeticException {
		
//		Menu menu = new Menu();
//		menu.run();
//		UtilityScanner.close();
		Calculator calc = new Calculator();
		calc.isNull(Optional.empty());
	}

}