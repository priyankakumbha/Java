class Z8
{
  public static void main(String[] args)
  {
    double f1 = test();
    System.out.println("main " + f1);
  }
  static double test()
  {
    System.out.println("test");
    return 2.5;
  }
}
