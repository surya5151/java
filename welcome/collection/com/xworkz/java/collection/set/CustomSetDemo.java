package com.xworkz.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class CustomSetDemo {
	public static void main(String[] args) {
		Perfume foog = new Perfume("Foog",200.00,"Rose","Strong");
		Perfume axe = new Perfume("AXE",300.00,"Jasmin", "Strong");
		Perfume denver = new Perfume("Denver",400.00,"Noflavor", "mild");
		Perfume title = new Perfume("Titel",500.00,"Rose", "mild");
		Perfume wildstone = new Perfume("Wildstone",300.00,"Noflore", "Strong");
		Perfume foog1 = new Perfume("Foog",200.00,"Rose","Strong");

		HashSet<Perfume> PerfumeSet = new HashSet();
		
		PerfumeSet.add(wildstone);
		PerfumeSet.add(title);
		PerfumeSet.add(denver);
		PerfumeSet.add(axe);
		PerfumeSet.add(foog);
		
		PerfumeSet.add(foog);
		PerfumeSet.add(foog1);

		Iterator<Perfume> perfumeItr = PerfumeSet.iterator();
		//method-1
		while(perfumeItr.hasNext()) {
			System.out.println(perfumeItr.next());			
		}
		//method-2
		for(Perfume perfume:PerfumeSet) {
			//System.out.println(perfume);
			
		}
		
	}
	
	
	

}
