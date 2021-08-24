package com.xworks.java.welcome;

public class Book {
	String name;
	int noOfPages;
	
	Book(){
		this ("clasmates");
		System.out.println("Default parametrised construction");
	}
	
	Book(String name, int noOfPages){
		this.name=name;
		this.noOfPages=noOfPages;
		System.out.println("Two parametrised construction");
		
	}
	
	Book(String name){  
		this ("clasmates",200);
		System.out.println("Single parametrised construction");
		
	}

}



