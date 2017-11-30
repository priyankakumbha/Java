class H
{
  static  int i;
  public static void test()
  {
    System.out.println("test:" + i);
    i = 100;
  }
  public static void main(String[] args)
  {
    System.out.println("main1:" + i);
    i = 10;
    test();
    System.out.println("main2" + i);
  }
}
