class arithmaticOperatationDemo4{
static int add(int a, int b){
int addResult= a+b;
return addResult;
}
static int sub(int x, int y){
int subResult= x-y;
return subResult;
}
static int mul(int p, int q){
int mulResult= p*q;
return mulResult;
}
static int div(int g, int h){
int divResult= g/h;
return divResult;
}
static int modules(int x, int y){
int modulesResult= x%y;
return modulesResult;
}
public static void main(String[] args)
{
int addResult1= add(10,20);
System.out.println("addtion:- " +addResult1);
int subResult2= sub(100,200);
System.out.println("substraction:- " +subResult2);
int mulResult3= mul(30,2);
System.out.println("multification:- " +mulResult3);
int divResult2= div(100,5);
System.out.println("division:- " +divResult2);
int modulesResult2= modules(101,2);
System.out.println("moduler:- " +modulesResult2);
}


}
