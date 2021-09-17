package com.xworkz.java.exception.custom.exception.custom_unchecked_exception;

public class WhatsAppException1 extends RuntimeException {
	private String message;
	
	WhatsAppException1(String message){
	this.message = message;	
	}
	public String getmessage() {
	 return message;
	}

}
