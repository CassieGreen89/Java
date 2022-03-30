package com.qa.edcalculator;

import com.qa.edcalculator.Menu;
import com.qa.edcalculator.UtilityScanner;

public class Runner {

	public static void main(String[] abc) throws ArithmeticException {
		
		Menu menu = new Menu();
		menu.run();
		UtilityScanner.close();
		
	}

}