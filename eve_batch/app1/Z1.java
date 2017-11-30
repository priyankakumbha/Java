class Z1
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = test();
    System.out.println("--------");
    int j = i + test();
    System.out.println(test());
    System.out.println("------");
    System.out.println(i + test());
    System.out.println("------");
    System.out.println(i + j + test());

  }
  public static int test()
  {
    System.out.println("test");
    return 10;// return type and value both should be compatible.
  }
}
//main
// test
// ----
// test
// test
// 10
// ----
// 20 test
// ---
// 40 test
