class Z6
{
  public static void main(String[] args)
  {
    boolean f1 = test();
    System.out.println("main " + f1);
  }
  static boolean test()
  {
    System.out.println("test");
    return true;
  }
}
