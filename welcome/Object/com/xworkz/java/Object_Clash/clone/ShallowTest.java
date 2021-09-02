package com.xworkz.java.Object_Clash.clone;

public class ShallowTest {

	public static void main (String[] args) {
		
		Bus bus = new Bus();
		Bus copyOfBus =null;
	    try {
	    	copyOfBus = bus.clone();   	
	    } catch (CloneNotSupportedException e) {
	    	e.printStackTrace();
	    }
	    System.out.println(bus);
	    System.out.println(copyOfBus);
	    System.out.println("..................");
	    
	    bus.name="Scania";
	    System.out.println(bus);
	    System.out.println(copyOfBus);
	    System.out.println("..................");
   
	    bus.driver.name="surya";
	    System.out.println(bus);
	    System.out.println(copyOfBus);
	      
	    		
	     
	}
}
