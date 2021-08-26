package com.xworkz.java.welcome;

public class SmartWatch extends Watch {

	String type;
	String model;
	
	SmartWatch(){
		super("FastTrack","black",5676);
		this.type="Modren";
		this.model="m-55";
	
		System.out.println("SmartWatch defult construction");
	}
	SmartWatch(String name){
		super("fast");
		this.name=name;
	}
}

