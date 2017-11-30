class K
{
  public static void main(String[] args)
  {
    int x = 10;
    try
    {
      System.out.println("try:" + x);
      x += 5;
      int i = 10/0;
    }
    catch(ArithmeticException ex)
    {
      System.out.println("catch:" + x);
      x += 10;
    }
    System.out.println("main end:" + x);
  }
}
