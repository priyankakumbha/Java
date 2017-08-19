class M20
{
  public static void main(String[] args)
  {
    System.out.println("done");
    C c1 = method1();
    c1.test1();
    c1.test2();
  }
  static C method1()
  {
   return new C()
    {
      public void test1()
      {
        System.out.println("from test1");
      }
      public void test2()
      {
        System.out.println("from test2");
      }
    };
  
  }
}
