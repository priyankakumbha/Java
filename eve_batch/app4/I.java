class I{
  static int x;
}
class J{
  static void test()
  {
    System.out.println("from test");
  }
}
class K
{
  public static void main(String[] args)
  {
    J.test();
    System.out.println(I.x);
  }
}
