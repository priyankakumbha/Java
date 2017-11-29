class A
{
  void test()
  {
    System.out.println("from A.test()");
  }
}
class R extends A
{
  void test(int i)
  {
    System.out.println("from R.test(int)");
  }
  public static void main(String[] args)
  {
    R r1 = new R();
    r1.test();
    System.out.println("done");
  }
}
