package com.xworkz.java.arrays_Assignment;

public class MaxNumber {

	public static void main(String[] args) {
		
		int[][] arr= new int[3][3];
		
		int count=10;
		int max= arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=count;
				count=count+10;
				if(arr[i][j]>max)
					max=arr[i][j];				
			}			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("Maximum number in the given Array is "+max);

	}
}
