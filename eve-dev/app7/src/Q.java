class A
{
  void test()
  {
    System.out.println("from A.test()");
  }
}
class Q extends A
{
  void test()
  {
    System.out.println("from Q.test()");
  }
  public static void main(String[] args)
  {
    Q q1 = new Q();
    q1.test();
    System.out.println("done");
  }
}
