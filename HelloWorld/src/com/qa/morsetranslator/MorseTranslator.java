package com.qa.morsetranslator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseTranslator {
	private final Map<String, String> morseMap = new HashMap<>();

	public void translate(String input) {
		morseMapMethod();
		String[] splitInput = input.split(" ");
		List<String> message = Arrays.asList(splitInput);
//		message.stream().forEach(x -> System.out.println(this.morseMap.get(x)));
		message.stream().map(x -> this.morseMap.get(x)).collect(Collectors.toList());
	}
	
	public void translateTwo(String input) {
		morseMapMethod();
		StringBuilder stringBuilder = new StringBuilder();
		String[] splitInput = input.split(" ");
		String output = "";
		for(String string : splitInput) {
			stringBuilder.append(output).append(this.morseMap.get(string));			
		}
		System.out.println(output);
	}

	public void morseMapMethod() {
		this.morseMap.put(".-", "a");
		this.morseMap.put("-...", "b");
		this.morseMap.put("-.-.", "c");
		this.morseMap.put("-..", "d");
		this.morseMap.put(".", "e");
		this.morseMap.put("..-.", "f");
		this.morseMap.put("--.", "g");
		this.morseMap.put("....", "h");
		this.morseMap.put("..", "i");
		this.morseMap.put(".---", "j");
		this.morseMap.put("-.-", "k");
		this.morseMap.put(".-..", "l");
		this.morseMap.put("-- ", "m");
		this.morseMap.put("-.", "n");
		this.morseMap.put("---", "o");
		this.morseMap.put(".--.", "p");
		this.morseMap.put("--.-", "p");
		this.morseMap.put("--.- ", "q");
		this.morseMap.put(".-.", "r");
		this.morseMap.put("...", "s");
		this.morseMap.put("-", "t");
		this.morseMap.put("..-", "u");
		this.morseMap.put("...-", "v");
		this.morseMap.put(".--", "w");
		this.morseMap.put("-..-", "x");
		this.morseMap.put("-.--", "y");
		this.morseMap.put("--..", "z");
		this.morseMap.put("/", " ");
	}
}
