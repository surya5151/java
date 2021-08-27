package com.xworkz.java;

public class Program2Demo {
	public static void main (String[] args) {
		Laptop laptop = new Laptop();
		System.out.println(laptop.BRAND);
		System.out.println(laptop.COLOR);
		System.out.println(laptop.DISPLAY);
		System.out.println(laptop.QUANTITY);
		System.out.println();
		Laptop laptop1 = new Laptop("brand");
		System.out.println(laptop1.BRAND);
		System.out.println(laptop1.COLOR);
		System.out.println(laptop1.DISPLAY);
		System.out.println(laptop1.QUANTITY);
		System.out.println();
		Laptop laptop2 = new Laptop("brand","color");
		System.out.println(laptop2.BRAND);
		System.out.println(laptop2.COLOR);
		System.out.println(laptop2.DISPLAY);
		System.out.println(laptop2.QUANTITY);
		
		
	}

}
