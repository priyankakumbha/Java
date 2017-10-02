class A
{
  int i;
  A(int i)
{
  this.i = i;
}
public boolean equals(Object obj)
{
  return (obj instanceof A) && (i == ((A)obj).i) ;
}
}
class M30
{
  public static void main(String[] args)
  {
A a1 = new A(90);
System.out.println(a1.equals(90));
System.out.println(a1.equals("abc"));
System.out.println(a1.equals(true));
System.out.println("done");
  }
}
