class Y
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = test();
    System.out.println("--------");
    int j = i + test();
    System.out.println("main end:" + i);
    System.out.println("main end:" + j);
  }
  public static int test()
  {
    System.out.println("test");
    return 10;// return type and value both should be compatible.
  }
}
