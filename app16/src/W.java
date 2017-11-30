class W
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    try
    {
        System.out.println("try begin");
        int[] x = new int[999999999];
        System.out.println("try end");
    }
    catch (OutOfMemoryError ex)
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
