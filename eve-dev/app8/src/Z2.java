class A
{
  void test()
  {
    System.out.println("from A()");
  }
}
class B extends A
{
  void test()
  {
    System.out.println("from B.test begin");
    super.test();
    System.out.println("from B.test end");
  }
}
class Z2
{
  public static void main(String[] args)
  {
    B b1 = new B();
    b1.test();
    System.out.println("done");
  }
}
