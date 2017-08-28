class T
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("from try begin");
      int i = 10 / 0;
      System.out.println("from try end");
    }
    catch (NullPointerException ex)
    {
      System.out.println("from catch:" + ex);
    }
  //(rised expectional handled or not finally will execute.
    finally
    {
      System.out.println("from finally");
    }
    System.out.println("main end");
  }
}
