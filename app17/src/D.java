class D
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    try
    {
      System.out.println("try begin");
      C c1 = new C();
      c1.test();
      System.out.println("try end");
    }
    catch(NoSuchMethodError err)
    {
      System.out.println("from catch:" + err);
    }
    System.out.println("main end");
  }
}
