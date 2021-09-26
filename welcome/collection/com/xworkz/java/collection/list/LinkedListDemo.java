package com.xworkz.java.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList<String> list = new LinkedList();
	
	list.add("Mobile");
	list.add("Pen");
	list.add("Pencil");
	list.add("TV");
	list.add("Fan");

	System.out.println(list);
		
	ListIterator listItr=  list.listIterator();
	
	while(listItr.hasNext()) {
		 System.out.println(listItr.next());
		
	}
	

	
}
}
