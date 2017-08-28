class C
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("try-begin");
      int i = 10 / 0;
      System.out.println("try-end");
    }
    catch(ArithmeticException ex)
    {
      System.out.println("catch-begin");
      int i = 10 / 0;
      System.out.println("catch-end");
    }
    finally
    {
      System.out.println("from finally");
    }
    System.out.println("main end");
  }
}
