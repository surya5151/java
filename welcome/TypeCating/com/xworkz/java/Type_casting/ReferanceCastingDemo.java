package com.xworkz.java.Type_casting;

public class ReferanceCastingDemo {
	public static void main(String[] args) {
		
		//up casting
		
		Animal animal = new Dog();		
		animal.eat();
		
		// down cating
		
		Dog dog =(Dog)animal;

		dog.eat();
		dog.bark();
		
		animal = new Cow();
		animal.eat();
		
		Cow cow = (Cow) animal;
		cow.produceMilk();
		
		//Dog dog1 = (Dog) animal;
		//dog1.eat();
		
}	
}
