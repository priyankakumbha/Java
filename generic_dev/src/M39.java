class A< X >
{
X obj;
}
class M39
{
  public static void main(String[] args)
  {
A < ? super S > a1 = null;
a1 = new A<S>();
a1.obj = new S();
System.out.println("done");

  }
}
