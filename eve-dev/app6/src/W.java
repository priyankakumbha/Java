interface A
{
  void test1();
}
interface B
{
  void test2();
}
class W implements A,B
{
  public void test1()
  {
    System.out.println("from test1");
  }
  public void test2()
  {
    System.out.println("from test2");
  }
  public static void main(String[] args)
  {
    W w1 = new W();
    System.out.println("-----");
    w1.test1();
    System.out.println("---");
    w1.test2();
  }
}
