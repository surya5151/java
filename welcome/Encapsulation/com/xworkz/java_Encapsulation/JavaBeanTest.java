package com.xworkz.java_Encapsulation;

public class JavaBeanTest {

	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setBrand(null);
		bag.setColor("Black");
		bag.setPrice(0);
		
		System.out.println(bag.getBrand());
		System.out.println(bag.getColor());
		System.out.println(bag.getPrice());
			
	}
}


