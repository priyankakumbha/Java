class P
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    try
    {
        System.out.println("try begin");
        int i = 10/0;
          System.out.println("try end");
    }
    catch (ArithmeticException ex)//Throwable
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
