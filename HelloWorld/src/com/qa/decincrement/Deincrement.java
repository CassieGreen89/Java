package com.qa.decincrement;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Deincrement {
	static int[] arr = {1,2,3,4,5};
	public static void main(String[] args) {
		
		
		for (int i = arr.length-1+1; i>=0; --i) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(i);
			}
			System.out.println(i + " Parent loop");
		}
		
		
		
	}
	

}
