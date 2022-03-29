package com.qa.classmembers;

public class Trees {
	private int height;
	private int numberOfLeaves;
	private static int numberOfTrees;
	
	public Trees(int height, int numberOfLeaves) {
		this.height = height;
		this.numberOfLeaves = numberOfLeaves;
		this.numberOfTrees ++;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getNumberOfLeaves() {
		return numberOfLeaves;
	}

	public void setNumberOfLeaves(int numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}

	public static int getNumberOfTrees() {
		return numberOfTrees;
	}

	public static void setNumberOfTrees(int numberOfTrees) {
		Trees.numberOfTrees = numberOfTrees;
	}
	
}
