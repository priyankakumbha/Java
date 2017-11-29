abstract class T
{
  abstract void test1();
  abstract void test2();
  void test3()
  {
    System.out.println("from test3");
  }
}
 abstract class U extends T
{
  void test2()
  {
    System.out.println("from test2");
  }
}
  class V extends U
  {
    void test1()
    {
      System.out.println("from test1");
    }

  public static void main(String[] args)
  {
    V v1 = new V();//should not create object to P class because it is abstract class
    v1.test1();
    System.out.println("-------");
    v1.test2();
    System.out.println("-------");
    v1.test3();
    System.out.println("-------");
    System.out.println("done");
  }
}
