class I
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = 10;
  //  test();
    System.out.println("main end:" + i);

  }
 public static void test()
  {
    System.out.println("from test:" + i);
   i = 20;
  }

}
