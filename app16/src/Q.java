class Q
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    try
    {
        System.out.println("try begin");
        int[] x = {10,20, 30};
        int i = x[3];
        System.out.println("try end");
    }
    catch (ArrayIndexOutOfBoundsException ex)
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
