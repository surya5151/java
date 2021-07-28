 class Flower{
String name;
String color;
int noOfPetals;
void blooming(){
System.out.println(noOfPetals+ " "+color+  " " +name+" is blooming....!!!!");
}
void shedFragrence(){
System.out.println(noOfPetals+ " "+color+ " " +name+" is shedding fragrance....!!");
}
public static void main(String args[]){
Flower rose=new Flower();
	rose.name= "Rose";
	rose.color= "Red";
	rose.noOfPetals=15;
	rose.blooming();
	rose.shedFragrence();
	
}

}