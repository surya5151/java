package com.xworks.java.welcome;

public class Mobile {
	String brand;
	String color;
	double price;
	
	Mobile(){
		this("one Plus","black");
		this.brand=brand;
		this.color=color;
		System.out.println("Defult construction");
	}
	
	Mobile(String brand){
		this("one Plus","Black",20000.00);
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("Single construction");
	}

	Mobile(String brand, String color){
		this(brand,color,20000.00);
		this.brand=brand;
		this.color=brand;
		this.price=price;
		System.out.println("Two construction");
	}
	
	Mobile (String brand, String color, double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("Three construction");
		
	}
}
