package com.xworkz.java.wrapper;

public class BoxingDemo {
	public static void main(String[] args) {
		
		int a =20;
		Integer x =a;			   		//auto boxing
		System.out.println(a);
		System.out.println(x);
		System.out.println("----------------------------");
		
		int b=10;
		Integer y = new Integer(b);		//manual boxing
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
			
		
	}

}
