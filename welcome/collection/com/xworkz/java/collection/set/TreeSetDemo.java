package com.xworkz.java.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet treeset = new TreeSet();
		
		treeset.add("surya");
		treeset.add("akash");
		treeset.add("joythi");
		treeset.add("priya");
		treeset.add("vikranth");
		treeset.add("Surya");
		treeset.add("surya");	//duplicate not allow
		//treeset.add('s'); 	//this condition we can do type casting
		
		System.out.println(treeset);
	}

}
