package com.xworkz.java_Encapsulation;

public class Bag {
	private String brand;
	private String color;
	private double price;
	
	public Bag(){
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand==null) {
			System.out.println("Brand can not be null");
			return;
			
		}
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price==0){
			System.out.println("price can not be zero");			
			return;
		}
		this.price = price;
	}

}
