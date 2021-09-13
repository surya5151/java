package com.xworkz.java.string;

public class StringWithNewKeyword {
public static void main(String[] args) {
	
	String str = new String("Manju");
	String str1 =str.intern();
	
	System.out.println(str1);
	System.out.println(str==str1);

	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	
	String str2 = new String("Manju");
	System.out.println(str1==str2);
	System.out.println(str2.hashCode());
	
	
	
}
}
