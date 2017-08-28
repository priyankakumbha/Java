class I
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("try:");
    }
    catch(ArithmeticException ex)
    {
      System.out.println("catch:");

    }
    System.out.println("main end:" + ex);
  }
}
