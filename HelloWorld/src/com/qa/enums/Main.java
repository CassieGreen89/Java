package com.qa.enums;

import com.qa.enums.Rank;

public class Main {
	
	public static void main(String[] args) {
		Dealer myDealer = new Dealer();
//		Card myCard = newCard();
		System.out.println(myDealer.dealCards());
		System.out.println(Rank.values()[1]);
		}
	}
