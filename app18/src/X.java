class X
{
  public static void main(String[] args)
  {
    System.out.println(1);
    try
    {
      test();
    }
    catch(ArithmeticException ex)
    {
      ex.printStackTrace();
    }
    System.out.println(2);
  }
  static void test()
  {
    System.out.println(3);
    int i = 10 / 0;
    System.out.println(4);
  }
}
