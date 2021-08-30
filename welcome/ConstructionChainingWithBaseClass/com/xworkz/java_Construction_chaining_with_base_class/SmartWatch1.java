package com.xworkz.java_Construction_chaining_with_base_class;

public class SmartWatch1 extends Watch1 {
	String type;
	String model;
	
	SmartWatch1(){
		super("FastTrack","black",5676);
		this.type="Modren";
		this.model="m-55";
	
		System.out.println("SmartWatch defult construction");
	}
	SmartWatch1(String name){
		super("fast");
		this.name=name;
	}
}



