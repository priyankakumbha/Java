class V
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    test();
  }
  public static int test()
  {
    System.out.println("test");
    return 10;// return type and value both should be compatible.
  }
}
