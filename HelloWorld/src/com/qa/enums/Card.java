package com.qa.enums;

import java.util.Random;

public class Card {
	
	protected Suit suitReturn() {
		return Suit.values()[0];
	}
	
	protected Rank rankReturn() {
		return Rank.values()[new Random().nextInt(Suit.values().length)];
	}

}
