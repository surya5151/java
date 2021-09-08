package com.xworkz.java.arrays;

public class CustomArray {
public static void main(String[] args) {
	
	

	Calender mallige = new Calender("Mallige", "Medium", 50.00,"pocket");
	Calender sampige = new Calender("Sampige", "Short", 30.00, "Table");
	Calender systemCalender = new Calender("Calender", "Smal", 500.00,"System");

	Calender[] calenders = {mallige,sampige,systemCalender};	
	for(Calender calender : calenders) {
		System.out.println(calender);
	}
	
	for(Calender calender : calenders) {
	 if(calender.type.equals("pocket")) {
		 System.out.println(calender);
	 }
	 
	}
	
	for(Calender calender : calenders) {
		 System.out.println(calender.type); 
		 
		}
	
	
	
}
}
