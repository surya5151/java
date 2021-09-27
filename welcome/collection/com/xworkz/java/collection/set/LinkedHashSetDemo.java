package com.xworkz.java.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<Double> linkedHashSet = new LinkedHashSet();
		
		linkedHashSet.add(100.00);
		linkedHashSet.add(500.00);
		linkedHashSet.add(800.00);
		linkedHashSet.add(200.00);
		linkedHashSet.add(1000.00);
		linkedHashSet.add(200.00);
		
		System.out.println(linkedHashSet);
		
	}

}
