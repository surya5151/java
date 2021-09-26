package com.xworkz.java.collection.list;

import java.util.ArrayList; 
import java.util.Iterator;

public class GenericArrayListDemo {

	public static void main(String[] args) {
		
		Laptop dell = new Laptop("Dell", 30000, "Black");
		Laptop sony = new Laptop("Sony", 40000, "White");
		Laptop apple = new Laptop("Apple", 50000, "Gray");
		Laptop lenovo = new Laptop("Lenovo", 25000, "Black");
		Laptop hp = new Laptop("HP", 20000, "Gray");
		Laptop thinkpad = new Laptop("Thinkpad", 15000, "Black");
		
		ArrayList<Laptop> laptoplist = new ArrayList();
		laptoplist.add(dell);
		laptoplist.add(sony);
		laptoplist.add(apple);
		laptoplist.add(lenovo);
		laptoplist.add(hp);
		laptoplist.add(thinkpad);
		
		System.out.println(laptoplist);
		
		System.out.println("List of the laptop...");
		Iterator<Laptop> laptopItr=laptoplist.iterator();
		while(laptopItr.hasNext()) {
			Laptop laptop=laptopItr.next();
			System.out.println(laptop);
		}
		System.out.println("................................");
		System.out.println("Price less then or equals to 25000rs...........!");
		Iterator<Laptop> laptopitr1 =laptoplist.iterator();
		while(laptopitr1.hasNext()) {
			Laptop laptop=laptopitr1.next();
			if(laptop.price<=25000) {
				System.out.println(laptop.brand);
			}			
		}
		System.out.println("................................");
		System.out.println("List of the Black color laptop...........!");

		Iterator<Laptop> laptopitr2 =laptoplist.iterator();
		while(laptopitr2.hasNext()) {
			Laptop laptop=laptopitr2.next();
			if(laptop.color.equals("Black")) {
				System.out.println(laptop.brand);
			}			
		}
		System.out.println("................................");
		System.out.println("Laptop Price <= 25000rs and color is Black  ...........!");

		Iterator<Laptop> laptopitr3 =laptoplist.iterator();
		while(laptopitr3.hasNext()) {
			Laptop laptop=laptopitr3.next();
			if(laptop.price<=25000 && laptop.color.equals("Black")) {
				System.out.println(laptop.brand);
			}			
		}
		System.out.println("................................");
		System.out.println("Laptop Price < 25000rs or color is Black  ...........!");

		Iterator<Laptop> laptopitr4 =laptoplist.iterator();
		while(laptopitr4.hasNext()) {
			Laptop laptop=laptopitr4.next();
			if(laptop.price<25000 || laptop.color.equals("Black")) {
				System.out.println(laptop.brand);
			}			
		}
			//price>20000 & colour is block
		System.out.println(".....................................");
		System.out.println("Laptops whose price is more the 20000 and clour is black............");
		for(Laptop laptop:laptoplist) {
			if(laptop.price>20000 || laptop.color.equals("Black")) {
				System.out.println(laptop);
				
			}
			
		}
		
		
		
	}

}
