class D
{
  public static void main(String[] args)
  {
    System.out.println("main-begin");
    int k = 10 / 0;
    try
    {
      System.out.println("try-begin");
      int i = 10 / 0;
      System.out.println("try-end");
    }
    catch(ArithmeticException ex)
    {
      System.out.println("from catch");
    }
    finally
    {
      System.out.println("from finally");
    }
    System.out.println("main end");
  }
}
