class Z2
{
  static int i = test();
  static
  {
    System.out.println("SIB:" + i);
  }
 static int test()
  {
    System.out.println("from test:" + i);
    return 10;
  }
  public static void main(String[] args)
  {
    System.out.println("main:" + i);
  }
}
