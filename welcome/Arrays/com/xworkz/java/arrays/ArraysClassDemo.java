package com.xworkz.java.arrays;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		
		String[] fruitArray = {"Bananna","Apple","Mosambi","Kivi","JackFruit"};
		
		System.out.println(Arrays.toString(fruitArray));
		
		Arrays.sort(fruitArray);
		System.out.println(Arrays.toString(fruitArray));
		
		String[] copiedArray=  Arrays.copyOf(fruitArray, 2);
		System.out.println(Arrays.toString(copiedArray));
		
		String[] copirdArraysRange= Arrays.copyOfRange(fruitArray, 1, 7);
		System.out.println(Arrays.toString(copirdArraysRange));
		
		int index = Arrays.binarySearch(fruitArray, "Mosambi");
		System.out.println("Search for Mosambi " +index);
		
		int surya = Arrays.binarySearch(fruitArray, "Kivi");
		System.out.println(surya);
		
		int deep =Arrays.deepHashCode(fruitArray);
		System.out.println(deep);
		
	}
}
