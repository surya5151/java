package com.xworkz.java.exception;

public class ExceptionCallStackDemo {

	static int divide(int a, int b) {
		return a/b;
	}
	
	static int ComputeDivision(int a, int b){
		int result = 0;
		try {
		return divide(a,b);
		}
		catch (NumberFormatException e) {
			System.out.println("Exception caught by ComputeDivision method");
		}
		return result;
		
	}
	
	public static void main (String[] args) {
	
		System.out.println("main stated");
		try {
			System.out.println(ComputeDivision(10,0));
		}
		catch (ArithmeticException e) {
			System.out.println("Exception caught by main method");
		}
		
		System.out.println("main end");
		
		String str1 = "surya"; 
		System.out.println(str1.length());
		
		String str = null;
		//System.out.println(str.length());
		
		
	}
}
