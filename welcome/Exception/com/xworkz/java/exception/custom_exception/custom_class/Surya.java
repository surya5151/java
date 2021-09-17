package com.xworkz.java.exception.custom_exception.custom_class;

public class Surya {
public static void main(String[] args) {
	
	Dmart dmart = new Dmart();
	
	try {
		dmart.searchItems("choco");
	} catch (DmartExp e) {
		System.out.println(e);
	}
}
}
 
