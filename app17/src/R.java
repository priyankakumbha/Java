class R
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("from try");
    }
    catch (ArithmeticException ex)
    {
      System.out.println("from catch:" + ex);
    }

    // (optional block u can keep after all catches
    finally
    {
      System.out.println("from finally");
    }
    System.out.println("MAIN END");
  }
}
