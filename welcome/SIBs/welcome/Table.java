package welcome;

public class Table {
	static String name;
	static String color;
	static String weight;
	static double price;
	
	Table(){
		System.out.println("Defult constructors...");
	}
	static{
		System.out.println("SIBs1...");
		name="computer Table";
		color="Grey";
		weight="15kg";
		price=5000;		
	}
	
	static {
		System.out.println("SIBs2...");
		name="DyningTable";
		color="white";
		weight="60kgs";
		price=60000;
		
		
	}
	

}
