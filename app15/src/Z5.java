class Z5
{
  static void test(Byte b)
  {
    System.out.println("Byte");
  }
  static void test(Integer b)
  {
    System.out.println("Integer");
  }
  public static void main(String[] args)
  {
    byte b1 = 10;
    test(b1);
    System.out.println("done");
  }
}
