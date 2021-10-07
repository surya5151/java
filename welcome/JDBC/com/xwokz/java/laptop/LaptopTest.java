package com.xwokz.java.laptop;

import com.xwokz.java.chair.Chair;


public class LaptopTest {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.compute();
		laptop.print();

		Chair chair = new Chair();
		chair.sit();
		chair.move();
		
		
	}

}
