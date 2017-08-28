class X
{

}
class Y
{
  public static void main(String[] args)
  {
    System.out.println("begin");
    try
    {
        System.out.println("try begin");
        X obj = new X();
        System.out.println("try end");
    }
    catch (NoClassDefFoundError ex)
    {
        System.out.println("from catch:" + ex);
    }
      System.out.println("end");
  }
}
