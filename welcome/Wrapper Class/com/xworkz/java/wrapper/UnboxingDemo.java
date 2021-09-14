package com.xworkz.java.wrapper;

public class UnboxingDemo {
	public static void main(String[] args) {
		
		Integer i = new Integer (10);
		int j=i;						//auto unboxing
		System.out.println(i);
		System.out.println(j);
		System.out.println("------------------------");
		
		
		int k = i.intValue();			//manual unboxing
		System.out.println(k);
		
		Float f = 20000.00f;
		short s = f.shortValue();		//manual unboxing
		float fl = f.floatValue();		// manual unboxing
		
		System.out.println(s);
		System.out.println(fl);
		
	}

}
