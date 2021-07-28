class Flower2{
	String name;
	String color;
	int noOfPetals;
void blomming(){
System.out.println(noOfPetals+ " " +name+ " " +color+ " is to be blooming..");
}
void shedFragrance(){
System.out.println(noOfPetals+ " " +name+ " " +color+   " is to be shedfragrrance..");
}
public static void main(String args[]) {
Flower2 jasmine = new Flower2();
	jasmine.name= "Jasmine";
	jasmine.color= "White";
	jasmine.noOfPetals=5;
	jasmine.blomming();
	jasmine.shedFragrance();
}
}