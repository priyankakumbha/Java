abstract class S
{
  abstract void test1();
  void test2()
  {
    System.out.println("from test2");
  }
}
 class R extends S
{
  void test1()
  {
    System.out.println("from test1");
  }
  public static void main(String[] args)
  {
    R r1 = new R();//should not create object to P class because it is abstract class
    r1.test1();
    System.out.println("-------");
    r1.test2();
    System.out.println("-------");
  }
}
