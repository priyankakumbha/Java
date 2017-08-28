class T
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    try
    {
        System.out.println("try begin");
        T t1 = (T) new Object();
        System.out.println("try end");
    }
    catch (ClassCastException ex)
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
