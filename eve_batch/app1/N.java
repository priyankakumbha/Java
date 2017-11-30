class N
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    test();

  System.out.println("main end");
}
static void test()
{
  System.out.println("ftest begin");
  if(true)
  {
    System.out.println("from if");
    return;
  }
  System.out.println("test end");
}
}
