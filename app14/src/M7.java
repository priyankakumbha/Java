class M7
{
public static void main(String[] args)
{
  A a1 = new A()
{
  void test3()
  {
    System.out.println("from AIC.test3");
  }
  void test1()
  {
    System.out.println("from AIC.test1");
    test3();
  }
};

  a1.test1();
  System.out.println("------------");
  a1.test2();
  System.out.println("------------");

}
}
