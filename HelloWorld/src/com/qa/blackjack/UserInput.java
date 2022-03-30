package com.qa.blackjack;

import java.util.Scanner;

public class UserInput {
	
	private static Scanner scan = new Scanner(System.In);
	
	public static int intScan() {
		System.out.println("Please enter a number");
		return scan.nextInt();
	}
	
	public static void close() {
		scan.close();
	}

}
