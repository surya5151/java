package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ArrayList samallist = new ArrayList();
		samallist.add(10);
		samallist.add(20);
		samallist.add(30);
		
		list.addAll(samallist);
		System.out.println("Before Remove ");		
		System.out.println("List: "+list);
		
		list.removeAll(samallist);
		System.out.println("After Remove ");
		System.out.println("List: "+list);
		
		System.out.println("Even number of the collection");
		
		Iterator itr =list.iterator();		
		while(itr.hasNext()) {
			Integer i =(Integer) itr.next();
			if(i%2 ==0) {
				System.out.println(i);
				
				
			}
			
		}
		
	}

}
