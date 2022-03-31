package com.qa.coins;

public class ChangeCalculator {
	
	public static void changeCalculator(double cost, double payment) {
		
		double remainingChange = payment - cost;
		double fiftyPoundCount = 0;
		double twentyPoundCount = 0;
		double tenPoundCount = 0;
		double fivePoundCount = 0;
		double poundCount = 0;
		double penniesCount = 0;
		boolean requiresChange = true;
				
		
// Wrap whole thing in while loop to check if remainingChange > 0	
		while(requiresChange) {
			if(remainingChange >= 50) {
				fiftyPoundCount = Math.floor(remainingChange / 50);
				remainingChange -= (50 * fiftyPoundCount);
				System.out.println((int)fiftyPoundCount + " £50 note(s)");
			}
				else {
					if(remainingChange >= 20) {
						twentyPoundCount = Math.floor(remainingChange / 20);
						remainingChange -= (20 * twentyPoundCount);
						System.out.println((int)twentyPoundCount + " £20 note(s)");
					}
					else {
						if(remainingChange >= 10) {
							tenPoundCount = Math.floor(remainingChange / 10);
							remainingChange -= (10 * tenPoundCount);
							System.out.println((int)tenPoundCount + " £10 note(s)");
						}
						else {
							if(remainingChange >= 5) {
								fivePoundCount = Math.floor(remainingChange / 5);
								remainingChange -= (5 * fivePoundCount);
								System.out.println((int)fivePoundCount + " £5 note(s)");
							}
							else {
								if(remainingChange >= 1) {
									poundCount = Math.floor(remainingChange / 1);
									remainingChange -= (1 * poundCount);
									System.out.println((int)poundCount + " £1 coin(s)");
								}
//								else {
//									if(remainingChange >= 0.01) {
//										penniesCount = remainingChange / 0.01;
//										remainingChange -= (0.01 * penniesCount);
//										System.out.println(penniesCount + " pence");
//									}
//								}
							}
						}
					}
				}
			if(remainingChange == 0) {
				requiresChange = false;
				System.out.println("Fully paid customer");
			}
			}
	}
}