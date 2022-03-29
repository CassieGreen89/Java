package com.qa.flowcontrol;

public class FlowControl {
	
	public static String message = "Print me!!";
			
	public static String methodScope() {
		String methodScopeVariable = "local";
		return "can't see local!!";
	}
	
	public static void main(String[] args) {
		System.out.println(message);
		System.out.println(methodScope());
		loopDeLoop();
	}

	public static void loopDeLoop() {
		int number = 10;
		for (int i = 0; i < 10; i++) 
		{number += 1;
		System.out.println(number);
			
		}
	}
}
