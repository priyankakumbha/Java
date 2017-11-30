class R
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    try
    {
        System.out.println("try begin");
        int i = Integer.parseInt("abc");
        System.out.println("try end");
    }
    catch (NumberFormatException ex)
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
