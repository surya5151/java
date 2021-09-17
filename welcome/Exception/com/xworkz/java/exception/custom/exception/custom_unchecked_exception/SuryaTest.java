package com.xworkz.java.exception.custom.exception.custom_unchecked_exception;

public class SuryaTest {
	public static void main(String[] args) {
		
		String[] names = {"Asha","pooja","vikranth","priya","surya",""};
		
		WhatsApp whatsApp = new WhatsApp();
		File file = new File();
		try {
		whatsApp.createGroup(names);
		whatsApp.shareFile(file);
		}
		catch (WhatsAppException e) {
			if (names.length>5) {
				System.out.println(e.getMessage());				
			}
			else {
				System.out.println(e);
				
			}

		}
	}
	

}
