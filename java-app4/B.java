class A
{
  int i;
  static int j;
}
class B extends A
{
  int k;
  static int m;
  public static void main(String[] args)
  {
    System.out.println(B.j);
    System.out.println(B.m);
    B b1 = new B();
    System.out.println(b1.i);
    System.out.println(b1.k);
  }
}
//A is superclass B is a subclass
