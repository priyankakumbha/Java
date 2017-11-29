class A
{
  void test()
  {
    System.out.println("from A.test()");
  }
}
class S extends A
{
  int test()
  {
    System.out.println("from S.test()");
    return 10;
  }
  public static void main(String[] args)
  {
    S s1 = new S();
    s1.test();
    System.out.println("done");
  }
}
