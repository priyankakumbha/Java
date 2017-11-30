class G
{
  public static void main(String[] args)
  {
    System.out.println("main-begin");
    if(true)
    {
      System.out.println("from if");
      return;
    }
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
