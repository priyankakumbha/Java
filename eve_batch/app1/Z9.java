class Z9
{
  public static void main(String[] args)
  {
    String f1 = test();
    System.out.println("main " + f1);
  }
  static String test()
  {
    System.out.println("test");
    return "abc";
  }
}
