class A
{
  int i;
  A(int i)
{
  this.i = i;
}
public String toString()
{
  return "i = " + i;
}
}
class M4
{
  public static void main(String[] args)
  {
    A a1 = new A(10);
    A a2 = new A(20);
    System.out.println(a1 );
    System.out.println(a2);
    String s1 = a1.toString();
    String s2 = a2.toString();
    System.out.println(s1 );
    System.out.println(s2);
  }
}
