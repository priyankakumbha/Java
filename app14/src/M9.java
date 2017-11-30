class M9
{
  public static void main(String[] args)
  {
    B b1 = new B()
{
  void test1()
  {
    System.out.println("AIC.B-test1()");
  }
};
    b1.test1();
    System.out.println("----------");
    b1.test2();
  }
}
