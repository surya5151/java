package com.xworkz.java.Object_Clash.to_string;

public class Ipad {
	String brand;
	String ramsize;
	String cameraQuality;
	double price;
	
	Ipad(String brand, String ramsize, String cameraQuality, double price){
		this.brand=brand;
		this.ramsize=ramsize;
		this.cameraQuality=cameraQuality;
		this.price=price; 
		
	}
	
	public String toString() {
		return this.brand=brand +"\n"+ this.ramsize+"\n"+ 
				this.cameraQuality+"\n"+ this.price;
	   
	}

}