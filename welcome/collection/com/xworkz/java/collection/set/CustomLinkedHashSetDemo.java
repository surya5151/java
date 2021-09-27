package com.xworkz.java.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomLinkedHashSetDemo {
	public static void main(String[] args) {
		
		Car ford = new Car("Ford","Feista",90000.00, "Silver");
		Car maruthi = new Car("Maruthi","Swift",80000.00, "White");
		Car kia = new Car("KIA","Sonet",100000.00, "Red");
		Car audi = new Car("Audi","CS200",250000.00, "White");
		Car renult = new Car("Renult","Tribur",120000.00, "Silver");

		LinkedHashSet<Car> carlinkedHashSet = new LinkedHashSet();
		
		carlinkedHashSet.add(renult);
		carlinkedHashSet.add(audi);
		carlinkedHashSet.add(kia);
		carlinkedHashSet.add(ford);
		carlinkedHashSet.add(maruthi);
		carlinkedHashSet.remove(audi);
		
		
		//System.out.println(linkedHashSet);
		
		Iterator<Car> carItr = carlinkedHashSet.iterator();
		//Method-1
		for(Car car:carlinkedHashSet) {			
			//System.out.println(car);
		}
		//Method-2
		while(carItr.hasNext()) {
			
			System.out.println(carItr.next());
		}
	}

}
