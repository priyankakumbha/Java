class A
{
  int i = 10;
}
class B extends A
{
  int i = 20;
}
class C extends B
{
  int i = 30;
}
class O
{
  public static void main(String[] args)
  {
    A a1 = new C();
    System.out.println(a1.i);
    B b1 = (B) a1;
    System.out.println(b1.i);
    C c1 = (C) a1;
    System.out.println(c1.i);
    System.out.println(((C)a1).i);
  }
}
