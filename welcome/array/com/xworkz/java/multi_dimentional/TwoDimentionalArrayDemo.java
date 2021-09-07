package com.xworkz.java.multi_dimentional;

public class TwoDimentionalArrayDemo {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int Count=10;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= Count;
				Count=Count+10;				
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] +" ");
				
			}
				System.out.println();
		}
		
		
	}

}
