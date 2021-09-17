package com.xworkz.java.exception.custom_exception.custom_class;

public class Sanju {
	public static void main(String[] args) {
		
		ATM atm = new ATM();
		int amount=500000;
	
		try {
			atm.drawAmount(amount );
		} 
		catch (ATMExp e) {
			System.out.println(e);
		}
		
	
	}

}
