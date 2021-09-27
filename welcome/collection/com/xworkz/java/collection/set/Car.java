package com.xworkz.java.collection.set;

public class Car {
	String brand;
	String model;
	double prize;
	String color;
	
	public Car(String brand,String model,double prize,String color) {
		this.brand=brand;
		this.model=model;
		this.prize=prize;
		this.color=color;
		
		
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", prize=" + prize + ", color=" + color + "]";
	}
	

}
