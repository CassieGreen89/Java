package com.qa.datatypes;

public class Datatypes {
	public static int integerprint(int output_int) {
		return output_int;
	}
	
	public static char charprint(char output_char) {
		return output_char;
	}
	
	public static float floatprint(float output_float) {
		return output_float;
	}
	
	public static void main(String[] args) {
		System.out.println(integerprint(12));
		System.out.println(charprint('L'));
		System.out.println(floatprint(0.6f));
	}

}

