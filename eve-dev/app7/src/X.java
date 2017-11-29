
class A
{
  void test()
  {
    System.out.println("from A.test()");
    
  }
}
class X extends A
{
  protected void test()//co-variant
  {
    System.out.println("from X.test()");

  }
  public static void main(String[] args)
  {
    System.out.println("done");
  }
}
