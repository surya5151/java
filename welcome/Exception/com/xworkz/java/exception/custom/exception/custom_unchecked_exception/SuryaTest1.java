package com.xworkz.java.exception.custom.exception.custom_unchecked_exception;

public class SuryaTest1 {
public static void main(String[] args) {
		
		String[] names = {"Asha","pooja","vikranth","priya","surya",};
		
		WhatsApp1 whatsApp1 = new WhatsApp1();
		File1 file1 = new File1();
		try {
		whatsApp1.createGroup(names);
		whatsApp1.shareFile(file1);
		}
		catch (WhatsAppException1 e) {
			System.out.println(e.getmessage());

		}
	}
	

}
