abstract class O
{
  abstract void test1();
  void test2()
  {
    System.out.println("from test2");
  }
}
abstract class N extends O
{
  public static void main(String[] args)
  {
    System.out.println("done");
  }
}
