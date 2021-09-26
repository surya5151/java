package com.xworkz.java.collection.list;

public class Mobile {

	String brand;
	double price;
	String color;
	
	public Mobile(String brand,double price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;		
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
}
