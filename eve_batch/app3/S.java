class S
{
  static int test()
  {
    System.out.println("from test");
    return 10;
  }
  static int i = test();
  
  public static void main(String[] args)
  {
    System.out.println(i);
  }
}
