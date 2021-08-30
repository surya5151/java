package com.xworks.java.welcome;



import com.xworkz.java_Construction_chaining_with_base_class.*;



public class Balloon {
	String color;
	double price;
	int size; 
	Apple1 apple1;
	Book book;
	WatchTest1 test;
	
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
