class E
{
  int i;
  static int j;
  void test1()
  {
    System.out.println("from test1");
  }
  static void test2()
  {
    System.out.println("from test2");
  }
}
class F extends E
{
  int m;
  static int n;
  void test3()
  {
    System.out.println("from test3");
  }
  static void test4()
  {
    System.out.println("from test4");
  }
  public static void main(String[] args)
  {
F.test2();
F.test4();
System.out.println(F.j);
System.out.println(F.n);
F f1 = new F();
System.out.println(f1.i);
System.out.println(f1.m);
f1.test1();
f1.test3();
System.out.println("done");
  }
}
