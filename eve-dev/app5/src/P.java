abstract class Q
{
  abstract void test1();
  void test2()
  {
    System.out.println("from test2");
  }
}
abstract class P extends Q
{
  public static void main(String[] args)
  {
    P p1 = new P();//should not create object to P class because it is abstract class
    System.out.println("done ");
  }
}
