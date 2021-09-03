package com.xworkz.java.Object_Clash.finalize;

public class Fan {
	String brand="Usha";

	@Override
	public String toString() {
		return "Fan [brand=" + brand + "]";
	}
	protected void finalize() throws Throwable {
		//super.finalize();
		System.out.println("calling finalize");
		
	}
	

}
