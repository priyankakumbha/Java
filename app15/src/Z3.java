class Z3
{
  static void test(byte b)
  {
    System.out.println("byte");
  }
  static void test(int b)
  {
    System.out.println("int");
  }
  public static void main(String[] args)
  {
    byte b1 = 10;
    test(b1);
    System.out.println("done");
  }
}
