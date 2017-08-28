class Z12
{
  static void test(String ... arg)
  {
    for(String s1 : arg)
    {
      System.out.println(s1 + "''");
    }
    System.out.println();
    System.out.println("-------");
    }


  public static void main(String[] args)
  {
    test("abc");
    System.out.println("-------------");
    test("abc", "xyz", "test", "hello");
    System.out.println("-------------");
    test("abc", "xyz", "test", "check", "hello", "123");
    System.out.println("-------------");
    test();
    System.out.println("---------");
  }
}
