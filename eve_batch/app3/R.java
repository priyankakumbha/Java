class R
{
  static int test1()
  {
    return 10;
  }
  static int i = test1() + test2();
  static int test2()
  {
    return 10;
  }
  public static void main(String[] args)
  {
    System.out.println(i);
  }
}
