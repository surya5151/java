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
		Iterator<Laptop> itr=laptoplist.iterator();
		while(itr.hasNext()) {
			Laptop lt=itr.next();
			System.out.println(lt);
		}
		System.out.println("................................");
		System.out.println("Price less then or equals to 25000rs...........!");
		Iterator<Laptop> itr1 =laptoplist.iterator();
		while(itr1.hasNext()) {
			Laptop lt=itr1.next();
			if(lt.price<=25000) {
				System.out.println(lt.brand);
			}			
		}
		System.out.println("................................");
		System.out.println("List of the Black color laptop...........!");

		Iterator<Laptop> itr2 =laptoplist.iterator();
		while(itr2.hasNext()) {
			Laptop lt=itr2.next();
			if(lt.color.equals("Black")) {
				System.out.println(lt.brand);
			}			
		}
		System.out.println("................................");
		System.out.println("Laptop Price <= 25000rs and color is Black  ...........!");

		Iterator<Laptop> itr3 =laptoplist.iterator();
		while(itr3.hasNext()) {
			Laptop lt=itr3.next();
			if(lt.price<=25000 && lt.color.equals("Black")) {
				System.out.println(lt.brand);
			}			
		}
		System.out.println("................................");
		System.out.println("Laptop Price < 25000rs or color is Black  ...........!");

		Iterator<Laptop> itr4 =laptoplist.iterator();
		while(itr4.hasNext()) {
			Laptop lt=itr4.next();
			if(lt.price<25000 || lt.color.equals("Black")) {
				System.out.println(lt.brand);
			}			
		}

	}

}
