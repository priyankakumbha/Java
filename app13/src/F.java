class F
{
  int i;
  static int j;
  void test1()
  {
    i = 10;
    j = 20;
    test1();
    test2();
    A a1 = new B();
    B b1 = new B();
  }
  static void test2()
  {
    i = 10;
    j = 20;
    test1();
    test2();
    A a1 = new B();
    B b1 = new B();
  }
  class A
  {
    int m;
    static int n;
  }
  static class B
  {
    int p;
    static int q;
  }

}
