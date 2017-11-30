class Z2
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
  System.out.println(test());
    System.out.println("--------");
    System.out.println(test() + test());
    System.out.println("--------");
    System.out.println(test() + test() + test());
    System.out.println("--------");
  }
  public static int test()
  {
    System.out.println("test");
    return 10;// return type and value both should be compatible.
  }
}
