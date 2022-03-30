package com.qa.edcalculator;

import com.qa.edcalculator.Calculator;
import com.qa.edcalculator.UtilityScanner;

public class Menu {
	
	
		public void run() {
		Calculator calc = new Calculator();
//		String action = getAction();
		Actions(action, calc);
	}

	public void getIntroAction() {
		String menuMsg = "==================================================\n" + "Calculator System:\n"
				+ "==================================================\n" + "\t- Add - add two parameters together"
				+ "\n" + "\t- Subtract - subtract an input from the second" + "\n"
				+ "\t- Multiply - multiply parameters together" + "\n" + "\t- Divide - divide a parameter by the other"
				+ "\n" + "\t=====\n" + "\t- Exit - Exit Application\n"
				+ "==================================================\n";
		System.out.println(menuMsg);

	}
	
	public String getAction() {
		System.out.println("What calculation do you want to perform? Type exit to exit");
		
		return UtilityScanner.returnString();
	}

// loop through values so user can interact with them so they are not limited to creating one 
// entry
	public void Actions(String action, Calculator calc) {
		String action = getAction();
		while(action != "exit") {
			switch (action) {
			case "add":
				System.out.println(
						"Your answer is: " + calc.addition(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
				break;
			case "subtract":
				System.out.println(
						"Your answer is: " + calc.subtraction(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
				break;
			case "divide":
				try {
					System.out
							.println("Your answer is: " + calc.div(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}
				break;
			case "multiply":
				System.out.println("Your answer is: " + calc.mult(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
				break;
			default:
				System.out.println("No match found");
				break;
	
			}
		if(action == "exit") {
			UtilityScanner.close();
			System.out.println("Thank you for using the calculator");
			return;
		}

	}
}
}
