package com.xworkz.java.welcome;

public class Watch {
	String name;
	String color;
	double price;
	
	Watch(String name, String color,double price){
		this.name="FastTrack";
		this.color="Gold";
		this.price=5000.00;
		System.out.println("Watch defult construction");
	
	}
	Watch(String name){
		this.name=name;
	}
}
