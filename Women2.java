class Women2{
	String name;
	String colour;
	String hight;
void talking(){
System.out.println(name+ " talking more ...!!!!");
}
void slepping(){
System.out.println(name+ " slepping more in a day..");
}
void dance(){
System.out.println(name+ " dance is very bad..");

}
void walk(){
System.out.println(name+ " " +colour+ " " +hight+  "  walking less in a day..");

}
public static void main(String[] args){
	Women2 bharthi = new Women2();
	bharthi.name = "Bharathi";
	bharthi.colour = "color is white";
	bharthi.hight=" hight 5fet";
	bharthi.talking();
	bharthi.slepping();
	bharthi.dance ();
	bharthi.walk();
}


}