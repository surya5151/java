package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CustomDemo {
	public static void main(String[] args) {

		Mobile apple = new Mobile("Apple",40000.00 ,"White");
		Mobile samsung = new Mobile("Samsung",20000.00,"Black");
		
		LinkedList<Mobile> list = new LinkedList();
		list.add(apple);
		list.add(samsung);
		System.out.println(list);
		
	ListIterator<Mobile> itr = list.listIterator();
		while(itr.hasNext()) {
			Mobile mobile=itr.next();
			System.out.println(mobile);
			
		}
		
		
		
	}

}
