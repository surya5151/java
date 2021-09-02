package com.xworkz.java.Object_Clash.clone;

public class Door implements Cloneable{

	String type;
	Lock lock;
	
	Door(String type, Lock lock){
		this.type=type;
		this.lock =lock;
		
	}
	
	public Door clone() throws CloneNotSupportedException {
		Door copyOfDoor=(Door)super.clone();
		copyOfDoor.lock =new Lock("Yuropa");
		return copyOfDoor;
	
	}

	@Override
	public String toString() {
		return "Door [type=" + type + ", lock=" + lock + "]";
	}
	
}
