package com.qa.enums;

public class Dealer {
	
	protected String dealCards() {
		Card myCard = new Card();
		return "Your card is " + myCard.rankReturn().toString().toLowerCase() + " of " + myCard.suitReturn().toString().toLowerCase();
	}

}
