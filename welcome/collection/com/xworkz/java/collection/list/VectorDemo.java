package com.xworkz.java.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<Character> vector = new Vector();
		
		vector.add('A');
		vector.add('B');
		vector.add('C');
		vector.add('D');
		vector.add('E');
		
	Enumeration<Character> enumeration	=vector.elements();
	
	while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
		
	}
		
		//System.out.println("Vector:"+vector);
			
	}

}
