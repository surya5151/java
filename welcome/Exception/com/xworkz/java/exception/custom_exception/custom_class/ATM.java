package com.xworkz.java.exception.custom_exception.custom_class;

import java.util.Arrays;

public class ATM {
	int [] avialbleAmount={ 50000};
	void drawAmount(int amount) throws ATMExp {
		if(Arrays.binarySearch(avialbleAmount, amount) !=-1) {
			System.out.println("Collect your cash....");
			
		}
		else {
			ATMExp atmexp = new ATMExp();
			throw atmexp;
		}
		
	}

}
