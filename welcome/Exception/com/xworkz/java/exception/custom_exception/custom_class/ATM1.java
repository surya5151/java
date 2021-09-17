package com.xworkz.java.exception.custom_exception.custom_class;

public class ATM1 {
	void draw (int amount) throws ATM1Exp {
		if (amount > 50000 || amount %100 !=0) {
			ATM1Exp atm1exp = new ATM1Exp();
			throw atm1exp;
			
		}
		else {
			System.out.println("Collect cash.....!");
		}
		
	}

}
