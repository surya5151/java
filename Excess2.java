class Excess2
{
public static void main(String[] args)
{
  int a=3;
  int b=5;
  --b;
  ++a;
  ++b;
  --a;
 int z=((++a)-(b--));
System.out.println((++a)-(b--));
System.out.println((z-(++b))-((++b)-(--a)));

System.out.println(a);
System.out.println(b); 
System.out.println(z);
}
}   