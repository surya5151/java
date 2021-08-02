class SwitchStatementDemo{
public static void main(String[] args){
  String traficSignal = "green";
switch (traficSignal){
case "red" : System.out.println("stop");
break;
case "yellow" : System.out.println("get ready");
break;
case "green" : System.out.println("move");
break;
default : System.out.println("involid value");
}

 
}
}