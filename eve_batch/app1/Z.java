class Z
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = test();
    System.out.println("--------");
    int j = i + test();
    System.out.println(test());

  }
  public static int test()
  {
    System.out.println("test");
    return 10;// return type and value both should be compatible.
  }
}
