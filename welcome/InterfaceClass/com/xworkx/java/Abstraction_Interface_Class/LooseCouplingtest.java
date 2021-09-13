package com.xworkx.java.Abstraction_Interface_Class;

public class LooseCouplingtest { 

public static void main(String[] args) {
	Sony sonyPrinter = new Sony();
	Epson epsonPrinter = new Epson();
	
	Computer computer = new Computer();
	computer.slot(sonyPrinter);
	computer.slot(epsonPrinter);
	
}

}
