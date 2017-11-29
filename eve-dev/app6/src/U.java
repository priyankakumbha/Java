interface S
{
  void test1();
  void test2();
  void test3();
}
abstract class T implements S
{
  public void test1()
  {
    System.out.println("from test1");
  }
  public void test2()
  {
    System.out.println("from test2");
  }
}
class U extends T{
  public void test3()
  {
    System.out.println("from test3");
  }

  public static void main(String[] args)
  {
    U u1 = new U();
    System.out.println("-------");
    u1.test1();
    System.out.println("-------");
    u1.test2();
    System.out.println("-------");
    u1.test3();
  }
}
