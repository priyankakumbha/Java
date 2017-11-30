class R
{
  int i;
  static void test()
  {
    R r1 = new R();
    r1.i = 10;
    System.out.println(r1.i);
    r1.i = 20;
    System.out.println(r1.i);
  }
  public static void main(String[] args)
  {
    test();
    System.out.println("done");
  }
}
