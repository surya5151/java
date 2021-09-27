package com.xworkz.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet<Character> hashset = new HashSet();
	
	hashset.add('A');
	hashset.add('D');
	hashset.add('C');
	hashset.add('B');
	hashset.add('A');
	hashset.add(null);
	hashset.add(null);
	
	Iterator hashsetItr = hashset.iterator();
	while(hashsetItr.hasNext()) {
		System.out.println(hashsetItr.next());
		
	}
	
	
	
	
}
}
