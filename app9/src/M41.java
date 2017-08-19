class A
{
  void test()
  {
    System.out.println("test()");
  }
  void test(int i)
  {
    System.out.println("test(int i)");
  }
}
class M41
{
  public static void main(String[] args)
  {
    A a1 = new A();
    a1.test();
    System.out.println("-------");
    a1.test(10);
  }
}
