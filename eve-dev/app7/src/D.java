interface A {
  void test1();
}
interface B{
  void test2();
}
interface C extends A, B
{
void test3();
}
class D implements C
{
  public void test1()
  {
    System.out.println("from test1");
  }
  public void test2()
  {
    System.out.println("from test2");
  }
  public void test3()
  {
    System.out.println("from test3");
  }
  public static void main(String[] args)
  {
    D d1 = new D();
    System.out.println("------");
    d1.test1();
    System.out.println("------");
    d1.test2();
    System.out.println("------");
    d1.test3();
  }
}
