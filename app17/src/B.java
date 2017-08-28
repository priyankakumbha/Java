class B
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    try
    {
      System.out.println("try begin");
      A a1 = new A();
      a1.i = 20;
      System.out.println("try end");
    }
    catch(NoSuchFieldError err)
    {
      System.out.println("from catch:" + err.getMessage());
    }
    System.out.println("main end");
  }
}
