class Z
{
  public static void main(String[] args)
  {
    System.out.println(1);
    try
    {
      test1();
    }
    catch(ArithmeticException ex)
    {
      ex.printStackTrace();
    }
    System.out.println(2);
  }
  static void test1()
  {
    System.out.println(3);
    test2();
    System.out.println(4);
  }
  static void test2()
  {
    System.out.println(5);
    int i = 10 / 0;
    System.out.println(6);
  }
}
