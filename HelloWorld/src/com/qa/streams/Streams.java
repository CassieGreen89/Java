package com.qa.streams;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public void exerciseOne() {
		List<String> exOne = Arrays.asList("Michael", "Dean", "James", "Chris");
		exOne.stream().forEach(n -> System.out.println(n));
	}
	
	public void exerciseTwo() {
		List<Integer> exTwo = Arrays.asList(3, 4, 7, 8, 12);
		int result = exTwo.stream().reduce((a,b) -> a*b).get();	
		System.out.println(result);
	}
	
	List<Integer> exThree = Arrays.asList(3, 4, 7, 8, 12, 24, 36, 99);
	
//	Find the max value.
	public void exerciseThree() {
		Integer maxiumum = exThree.stream().max(Integer::compare).get();
		System.out.println(maxiumum);
	}
	
//	Find the min value.
	public void exerciseFour() {
		Integer minimium = exThree.stream().min(Integer::compare).get();
		System.out.println(minimium);
	}	
//	Remove the odd numbers.
	public void exerciseFive() {
		List<Integer> evens = exThree.stream().filter(x -> x % 2 == 0).
				collect(Collectors.toList());
		System.out.println(evens);
	}
	
//	Remove the even numbers.
	public void exerciseSix() {
		List<Integer> odds = exThree.stream().filter(x -> x % 2 != 0).
				collect(Collectors.toList());
		System.out.println(odds);
	}
	
//	Find the sum of the list.
	public void exerciseSeven() {
		Integer sumOfList = exThree.stream().reduce((a, b) -> a + b).get();
		System.out.println(sumOfList);
	}
	
//	Square every number in the list then remove the even numbers and then 
//	find the min value. Map, then filter, then min
	public void exerciseEight() {
		Integer complexLambda = exThree.stream().map((a,b) -> a + b)
				.filter(x -> x % 2 != 0).collect(Collectors.toList())
	}
	
	public static void main(String[] args) {
		Streams stream = new Streams();
		stream.exerciseOne();
		stream.exerciseTwo();
		stream.exerciseThree();
		stream.exerciseFour();
		stream.exerciseFive();
		stream.exerciseSix();
		stream.exerciseSeven();
	}
}
