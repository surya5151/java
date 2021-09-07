package com.xworkz.java.multi_dimentional;

public class TwoDimentionalArrayDemo1 {
	public static void main(String[] args) {
		int[][] arr =new int[2][10];
		
		int Count=100;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=Count;
				Count=Count+50;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
		
			}
			System.out.println();
	}
	
}	
}
