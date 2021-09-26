package com.xworkz.java.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		
	LinkedList linkedlist = new LinkedList();
	
	linkedlist.add("dog");
	linkedlist.add("tiger");
	linkedlist.add("cow");
	linkedlist.add("lion");
	linkedlist.add("Elephent");
	linkedlist.add("rabit");
	
	//System.out.println(linkedlist);
	
	ListIterator<String> listItr = linkedlist.listIterator();
	while(listItr.hasNext()) {
		String animalItr = listItr.next();
		//System.out.println(animalItr);
		if(animalItr.equals("cow")) {
			listItr.add("Jarman Cow");		
		}
		else if (animalItr.equals("lion")) {
			listItr.remove();
		}
		else if (animalItr.equals("Elephent")) {
			listItr.set("Zebra");
		}
		
	}
	System.out.println(linkedlist);	
	
}

} 
