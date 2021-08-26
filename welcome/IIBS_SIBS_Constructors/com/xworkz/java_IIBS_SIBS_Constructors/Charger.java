package com.xworkz.java_IIBS_SIBS_Constructors;

public class Charger {
	static String brand;
	String color;
	static String powerConsuption;
	static double price;
	
	Charger(){
		System.out.println("Defult");		
	}
	
	{
		System.out.println("IIBs1.....");
		brand="Samsung";
		color="White";
		//price=100;
		//powerConsuption="230v";		
	}
	
	{
		System.out.println("IIBs2....."); 
		brand="MI";
		color="Black";
		//price=70;
		//powerConsuption="230v";		
	}
	static {
		System.out.println("SIBs1...");
		price=300;
		powerConsuption="220v";
	}
	static {
		System.out.println("SIBs2...");
		brand="sony";
		price=500;
		
	}
	
}
