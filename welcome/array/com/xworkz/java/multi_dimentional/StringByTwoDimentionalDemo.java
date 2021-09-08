package com.xworkz.java.multi_dimentional;

public class StringByTwoDimentionalDemo {
	public static void main(String[] args) {
		
		String[][] arr = new String[][] {{"one","two"},{"one","two"}};
		
		String Count="Surya";
		for(int String=0; String<arr.length; String++) {
			for(int String1=0; String1<arr[String].length; String1++) {
					arr [String][String1]= Count;
					Count=Count+"Yogi";				
			}
		}
		for(int String=0; String<arr.length; String++) {
			for(int String1=0; String1<arr[String].length; String1++) {
				System.out.print(arr[String][String1]+"  ");
				
			}
					System.out.println();
		}
		
		
		
		
		
	}

}
