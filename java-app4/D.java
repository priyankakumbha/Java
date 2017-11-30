class C
{
  void test1()
  {
    System.out.println("from test1");
  }
  static void test2()
  {
    System.out.println("from test2");
  }
}
class D extends C
{
  void test3()
  {
    System.out.println("from test3");
  }
  static void test4()
  {
    System.out.println("from test4");
  }
  public static void main(String[] args)
  {
    D.test2();
    D.test4();
    D d1 = new D();
    d1.test1();
    d1.test3();
System.out.println("done");
  }
}
