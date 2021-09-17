package com.xworkz.java.exception.custom.exception.custom_unchecked_exception;

public class WhatsApp {

	void createGroup(String[] names) {
		if(names.length>5) {
			throw new WhatsAppException();
		}
		else {
			System.out.println("your whatsApp group created sucessfully....");
		}
	}
	
	void shareFile(File file) {
		if (file.size >1024) {
			throw new WhatsAppException();
		
		}   
		else {
			System.out.println("File uploaded sucessfully.....! ");
		}
		
	}
}
