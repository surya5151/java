package com.xworkz.java.Object_Clash.finalize;

public class FinalizeMethodDemo {
public static void main(String[] args) {
	
	Fan fan = new Fan();
	System.out.println(fan);
	
	fan=null;
	System.gc();
}
}
