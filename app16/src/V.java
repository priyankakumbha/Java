class V
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    int i = 10/0;
    try
    {
        System.out.println("try begin");
        System.out.println("try end");
    }
    catch (ArithmeticException ex)
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
