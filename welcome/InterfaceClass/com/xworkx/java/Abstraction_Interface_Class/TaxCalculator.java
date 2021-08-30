package com.xworkx.java.Abstraction_Interface_Class;

public class TaxCalculator implements CentralTax, StateTax {


	public void propertyTax() {
		
		System.out.println("Property tax of state");
	}

	
	public void roadTax() {
		System.out.println("Road tax of central");
		
	}

}
