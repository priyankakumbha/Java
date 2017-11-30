class Z3
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = test1();
    System.out.println(i);
    System.out.println("--------");
  }
  public static int test1()
  {
    System.out.println("test1");
    return test2();// return type and value both should be compatible.
  }

public static int test2()
{
  System.out.println("test2");
  return 10;// return type and value both should be compatible.
}
}
