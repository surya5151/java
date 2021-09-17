package com.xworkz.java.string;

public class StringMethodDemo {
	public static void main(String[] args) {
		
		String str ="Gowri";
		String str1="Ganesha";
		
		String UppercaseStr = str.toUpperCase();		
		System.out.println(UppercaseStr);
		System.out.println(str);
		
		char surya = str.charAt(0);
		System.out.println("char at 0: "+surya);
		
		String concatedString = str.concat(str1);
		System.out.println("Concated String: "+concatedString);
		
		System.out.println("is concatedString contains Gowri: " +concatedString.contains("Gowri"));		
		System.out.println("Index of r in Gowri: " +str.indexOf('r'));		
		System.out.println("Is string Gowri Empty: "+str.isEmpty());		
		System.out.println("Is string Empty: " + "".isEmpty());		
		System.out.println("Is equal methods: "+str.equals(UppercaseStr));		
		System.out.println("Is equalIgnore method: "+str.equalsIgnoreCase(UppercaseStr));
		System.out.println("Is index of a in Ganesh: "+str1.indexOf('a'));
		System.out.println("Is intern method store in same String value:"+str.intern());
		System.out.println("The length of object Ganesha is: "+str1.length());
		System.out.println("To replace the string object: "+str1.replace( "Gane", "Ravi"));
		System.out.println("To match the string object by boolean: "+str.matches(str1));
		System.out.println("To replace string object: "+str.replaceAll(str, "LAKSHMI"));
		//System.out.println(str.split(str1));
		System.out.println("To startwith method in boolean out: "+str.startsWith("Ganes"));
		System.out.println("To subsequence enter with in the String[]:"+str1.subSequence(3, 7));
		System.out.println("To substring enter after the all String[]: "+str.substring(3));
		
	
		
	
		 
		
		
	}
	

}
