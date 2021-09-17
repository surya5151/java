package com.xworkz.java.exception.custom.exception.custom_unchecked_exception;

public class WhatsAppException extends RuntimeException {
 
	@Override
	public String getMessage() {
		return "can't create Group with more then 5 members";
	}
	
	@Override
	public String toString() {
		return "can't uplode more then 1GB";
	}
}
