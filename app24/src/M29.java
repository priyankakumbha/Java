class A
{
  int i;
  A(int i)
{
  this.i = i;
}
public boolean equals(Object obj)
{
  return i == ((A)obj).i ;
}
}
class M29
{
  public static void main(String[] args)
  {
A a1 = new A(90);
System.out.println(a1.equals(90));
System.out.println("done");
  }
}
