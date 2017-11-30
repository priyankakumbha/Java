class Z9
{
  static void test(int ... i)
  {
    System.out.println("from test(var args)");
  }
  public static void main(String[] args)
  {
    test();
    System.out.println("-------------");
    test(20, 30);
    System.out.println("-------------");
    test(1, 4, 7, 9, 20);
    System.out.println("-------------");
  }
}
