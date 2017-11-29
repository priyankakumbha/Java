interface O
{
  void test1();
}
class P implements O
{
  public void test1()
  {
    System.out.println("from test1");
  }
  public static void main(String[] args)
  {
    P p1 = new P();
    System.out.println("-------");
    p1.test1();
  }
}
