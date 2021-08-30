package com.xworkz.java_Construction_chaining_with_base_class;

public class Watch1 {
	String name;
	String color;
	double price;
	
	 Watch1(String name, String color,double price){
		this.name="FastTrack";
		this.color="Gold";
		this.price=5000.00;
		System.out.println("Watch defult construction");
	
	}
	Watch1(String name){
		this.name=name;
	}
}


