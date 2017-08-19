class M17
{
  static void method1(C c1)
  {
    c1.test1();
    c1.test2();
  }
  public static void main(String[] args)
  {
    System.out.println("done");
    method1(new C()
    {
      public void test1()
      {
        System.out.println("from test1");
      }
      public void test2()
      {
        System.out.println("from test2");
      }
    });
    
  }
}
