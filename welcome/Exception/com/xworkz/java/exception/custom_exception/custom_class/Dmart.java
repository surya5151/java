package com.xworkz.java.exception.custom_exception.custom_class;

import java.util.Arrays;

public class Dmart {

	String[] demartStore= {"oil", "choco", "dryfruit", "rice", "pepsi"};
	void searchItems(String itemName) throws DmartExp {
		if(Arrays.binarySearch(demartStore, itemName) !=-1) {
			System.out.println("items is available please bye it.");
		}
		else {
			DmartExp dmartexp = new DmartExp();
			throw dmartexp;
		}
	}

}
