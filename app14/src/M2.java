class M2
{
public static void main(String[] args)
{
  A a1 = new A()
{
  void test1()
  {
    System.out.println("from AIC.test1");
  }
};

  a1.test1();
  System.out.println("------------");
  a1.test2();
  System.out.println("------------");
}
}
