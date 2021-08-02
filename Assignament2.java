class Assignament2
{
public int add(int a , int b)

{
return a+b;
}

public int sub(int x , int y)

{
return x-y;
}
public int mul(int p , int q)

{
return p*q;
}
public int div(int g , int h)

{
return g/h;
}
public int modules(int u , int v)

{
return u%v;
}
public static void main (String args[])
{
 Assignament2 operator = new Assignament2();
System.out.println("addition " +operator.add(10,20));
System.out.println("subtraction "  +operator.sub(100,50));
System.out.println("multification "  +operator.mul(10,5));
System.out.println("division "  +operator.div(1000,100));
System.out.println("modular "  +operator.modules(11,5));
}
}