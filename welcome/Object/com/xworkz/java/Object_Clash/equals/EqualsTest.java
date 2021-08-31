package com.xworkz.java.Object_Clash.equals;

public class EqualsTest {
	public static void main(String[] args) {
		
		Trainer asha = new Trainer("Asha","Female",6 );
		Trainer asha1 = new Trainer("Asha","Female",6);
		Trainer omkar = new Trainer("Omkar","Male",12 );

		System.out.println(asha.equals(asha1));
		
		
	}

}
