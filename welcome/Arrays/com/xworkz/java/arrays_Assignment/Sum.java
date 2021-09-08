package com.xworkz.java.arrays_Assignment;

public class Sum {
	public static void main(String[] args) {
		int[][] arr= new int[2][4];
				int count=1;
				int sum= arr[0][0];
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						arr[i][j]=count;
						count=count+1;	
						sum=arr[i][j]+sum;
					}					
				}
	
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] +" ");				
					}	
					System.out.println();
				}
				System.out.println("-------------------------------");
				System.out.println("Sum of all the element in array is:"+sum);
	}
}
