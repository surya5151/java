package com.xworkz.java.Object_Clash.clone;

public class Bus implements Cloneable {

	String name="volvo";
	Driver driver = new Driver();
	
	public Bus clone() throws CloneNotSupportedException {
		return (Bus) super.clone();
		
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", driver=" + driver + "]";
	}
	
}
