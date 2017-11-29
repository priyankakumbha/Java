class L
{
  void test()
  {
    System.out.println("test()");
  }
  int test(int i)
  {
    System.out.println("test(int)");
    return 10;
  }
  double test(int i, int j)
  {
    System.out.println("test(int, int)");
    return 3.4;
  }
  public static void main(String[] args)
  {
    L obj = new L();
    obj.test();
    System.out.println("------");
    System.out.println(obj.test(10));
    System.out.println("------");
    System.out.println(obj.test(10,30));
    System.out.println("------");
  }
}
