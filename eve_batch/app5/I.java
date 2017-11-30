class I
{
  void test()
  {
    System.out.println("from test");
  }

  public static void main(String[] args)
  {
  I obj = new I();
  // I is like data type derived data type = I is the class name
  obj.test();
    System.out.println("-----");
    obj.test();
  }
}
