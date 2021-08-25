package com.xworks.java.welcome;

public class Balloon {
	String color;
	double price;
	int size;
	
	Balloon(){
		this("green");
		System.out.println("Defult");
		
	}
	
	Balloon(String color){
		this("green",10);
		System.out.println("single");
		
	}

	Balloon(String color, int size){
		this("green",10,5.00);
		System.out.println("Two");
		
	}
	
	Balloon(String color, int size, double price){
		this.color=color;
		this.price=price;
		this.size=size;
		
		System.out.println("Three");
		
	}
}
