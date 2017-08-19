class M13
{
  public static void main(String[] args)
  {
    C c1 = new C()
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
    System.out.println("------------");
    c1.test1();
    System.out.println("------------");
     c1.test2();
    System.out.println("------------");
  }
}
