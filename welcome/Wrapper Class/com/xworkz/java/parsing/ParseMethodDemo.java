package com.xworkz.java.parsing;

public class ParseMethodDemo {
	public static void main(String[] args) {
		
		String s1="10";
		String s2="20";
		
		System.out.println(s1+s2); 		//concated operation
		System.out.println("--------------------------------");
		
		Integer i = Integer.parseInt(s1); 	//converting string into integer
		Integer j = Integer.parseInt(s2);	//converting string into integer
		
		
		System.out.println(s1+s2);
		System.out.println("i+j : "+(i+j));
		
		
		String s3= "true";
		System.out.println(Boolean.parseBoolean(s3)); //converting string in boolean
		
		
		
		
	}

}
