class Assignament1
{
public int add(int a , int b)

{
return a+b;
}

public int sub(int x , int y)

{
return x-y;
}
public static void main (String args[])
{
 Assignament1 operator = new Assignament1();
System.out.println("addition " +operator.add(1,2));
System.out.println("subtraction "  +operator.sub(10,5));
}
}