package com.xworkz.java.exception.custom_exception.custom_class;

public class ATMExp extends Exception {

	@Override
	public String toString() {
		return "The amount you entered exceding the limit...";
	}
	
}
