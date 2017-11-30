class G
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    try
    {
      System.out.println("try begin");
      main(args);
      System.out.println("try end");
    }
    catch(StackOverflowError err)
    {
      System.out.println("from catch:" + err);
    }
    System.out.println("main end");
  }
}
