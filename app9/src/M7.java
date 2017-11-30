class M7
{
  public static void main(String[] args)
  {
    D d1 = new E();
    Object obj = test1(d1);
    System.out.println("done");
  }
  public static A test1(C c1)
  {
    System.out.println("test1");
    return test2(c1);
  }
  public static B test2(B b1)
  {
    System.out.println("test2");
    return b1;
  }
}
