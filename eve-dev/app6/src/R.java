interface Q
{
  void test1();
  void test2();
}
class R implements Q
{
  public void test1()
  {
    System.out.println("from test1");
  }
  public void test2()
  {
    System.out.println("from test2");
  }
  public static void main(String[] args)
  {
    R r1 = new R();
    System.out.println("-------");
    r1.test1();
    r1.test2();
  }
}
