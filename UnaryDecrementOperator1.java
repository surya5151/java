class UnaryOperatorDecrement2
{
public static void main(String[] args)
{
  int x=1;
  int y=10;
  int z= x--;
  z--;
System.out.println(x+y);
System.out.println(--z+y);
System.out.println((y--)-(--x));

}
}