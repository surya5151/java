package com.xworkz.java.Object_Clash.clone;

public class DeepTest {

	public static void main (String[] args) {
		
		Lock lock = new Lock("Yuropa");
		Door door = new Door("Wooden", lock);
		
		try {
			Door doorCopy=door.clone();
			System.out.println(door);
			System.out.println(door);
			
			doorCopy.lock.brand="Godrej";
			System.out.println("................");
			System.out.println(door);
			System.out.println(doorCopy);
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
}
