interface A
{
  void test1();
  void test2();
}

class B
{
  public void test2()
  {
    System.out.println("test2");
  }
}
class F extends B implements A
{
    public void test1()
    {
      System.out.println("test1");
    }
      public static void main(String[] args)
      {
    F f1 = new F();
    f1.test1();
    System.out.println("------");
    f1.test2();
    System.out.println("done");
  }
}
