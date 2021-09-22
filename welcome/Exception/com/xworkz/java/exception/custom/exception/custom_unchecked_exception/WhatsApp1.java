package com.xworkz.java.exception.custom.exception.custom_unchecked_exception;

public class WhatsApp1 { 
	void createGroup(String[] names) {
		if(names.length>5) {
			throw new WhatsAppException1("can't create group with more the 5 member...");
		}
		else {
			System.out.println("Your whatsApp group created sucessfully....");
		}
	}
	
	void shareFile(File1 file1) {
		if (file1.size >1024) {
			throw new WhatsAppException1("Invalid file size...");
		
		}   
		else {
			System.out.println("File uploaded sucessfully.....! ");
		}
		
	}

}
