interface J
{
  void test();
  void test(int i);
}
class K implements J
{
  public void test()
  {
    System.out.println("from test");
  }
  public void test(int i)
  {
    System.out.println("from test(int)");
  }
  public static void main(String[] args)
  {
    K k1 = new K();
    k1.test();
    System.out.println("------");
    k1.test(20);
    System.out.println("------");
  }
}
