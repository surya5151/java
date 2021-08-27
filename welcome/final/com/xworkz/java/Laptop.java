package com.xworkz.java;

public class Laptop {
	final String BRAND;
	final String COLOR;
	final String DISPLAY;
	final int QUANTITY;
	Laptop(){
		BRAND= "Lenova";
		COLOR="Black";
		DISPLAY="15inc";
		QUANTITY=15;
	}
	Laptop(String brand){
		BRAND= "Dell";
		COLOR="White";
		DISPLAY="20inc";
		QUANTITY=20;
	}
	Laptop(String brand,String color){
		BRAND= "Sony";
		COLOR="Cream";
		DISPLAY="25inc";
		QUANTITY=25;
	}
	
}
