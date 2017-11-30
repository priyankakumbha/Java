class F
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    try
    {
      System.out.println("try begin");
      E obj = new E(90);
      System.out.println("try end");
    }
    catch(NoSuchMethodError err)
    {
      System.out.println("from catch:" + err);
    }
    System.out.println("main end");
  }
}
