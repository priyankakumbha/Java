abstract class A
{
  void test()
  {
    System.out.println("test");
  }
  abstract void test(int i);
}
class O extends A
{
  void test(int i)
  {
    System.out.println("from test(int)");
  }
  public static void main(String[] args)
  {
    O o1 = new O();
    o1.test();
    System.out.println("-------");
    o1.test(10);
  }
}
