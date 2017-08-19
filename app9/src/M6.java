class M6
{
  public static void main(String[] args)
  {
    C c1 = new E();
    Object obj = test(c1);
    System.out.println("done");
  }
  public static A test(B b1)
  {
    System.out.println("test");
    return b1;
  }
}
