class H
{
  public static void main(String[] args)
  {
    try
    {
      int i = 10;
      System.out.println("try:" + i);
    }
    catch(ArithmeticException err)
    {
      System.out.println("catch:" + i);
      i += 20;
    }
    System.out.println("main end:" + i);
  }
}
