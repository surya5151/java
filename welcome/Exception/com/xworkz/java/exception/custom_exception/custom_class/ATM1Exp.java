package com.xworkz.java.exception.custom_exception.custom_class;

public class ATM1Exp extends Exception {
	@Override
	public String toString() {
		return "The amount you entered exceding the limit.....! ";
	}
	
	@Override
	public String getMessage() {
		return "Invalid amount.....!" ;
	}

}
