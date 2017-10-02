class W
{
  public static void main(String[] args)
  {
    System.out.println(1);
    test();
    System.out.println(2);
  }
  static void test()
  {
    System.out.println(3);
    try
    {
      int i = 10/ 0;
    }
    catch(ArithmeticException ex)
    {
      ex.printStackTrace();
    }
  
    System.out.println(4);
  }
}
