package com.xworkz.java;

public class finalTest3 {

	public static void main(String[] args) {
		
		PowerBank3 power= new PowerBank3();
		System.out.println(power.CAPACITY);
		PowerBank3 power1= new PowerBank3(1);
		System.out.println(power1.CAPACITY);
		PowerBank3 power2 = new PowerBank3(1,2);
		System.out.println(power2.CAPACITY);
		PowerBank3 power3 = new PowerBank3(1,2,3);
		System.out.println(power3.CAPACITY);

		
	} 
}
