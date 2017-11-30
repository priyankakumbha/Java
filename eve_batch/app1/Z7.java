class Z7
{
  public static void main(String[] args)
  {
    char f1 = test();
    System.out.println("main " + f1);
  }
  static char test()
  {
    System.out.println("test");
    return '8';
  }
}
