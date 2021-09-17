package com.xworkz.java.exception.custom_exception.custom_class;

public class ATM1Test {
	public static void main(String[] args) {
		
		ATM1 atm1 = new ATM1();
		int amount = 40000;
		try {
			atm1.draw(amount);
		} catch (ATM1Exp e) {
			if (amount>50000) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}

}
