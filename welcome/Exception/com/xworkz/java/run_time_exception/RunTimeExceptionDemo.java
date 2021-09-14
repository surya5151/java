package com.xworkz.java.run_time_exception;

public class RunTimeExceptionDemo {
	public static void main(String[] args) {
		
		int a=10/0;				// NonCompliant (anything devid by 0 not possible)
		System.out.println(a);
		System.out.println("-----");
		
		
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		
		
		
	}

}
