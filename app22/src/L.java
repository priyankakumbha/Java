class L
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = 10;
    assert test1() : test2();
    System.out.println("main end");
  }
  static boolean test1()
  {
    System.out.println("from test1");
    return true;
  }
  static void test2()
  {
    System.out.println("from test2");
  }
}
