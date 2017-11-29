class I
{
  void test()
  {
    System.out.println("from test");
  }
  void test(int i)
  {
    System.out.println("from test(int)");
  }
  public static void main(String[] args)
  {
    I obj = new I();
    obj.test();
    System.out.println("------");
    obj.test(20);
      System.out.println("------");
  }
}
