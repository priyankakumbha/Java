class I
{
  void test()
  {
    System.out.println("test:" + this);
  }
  public static void main(String[] args)
  {
    I obj1 = new I();
    I obj2 = new I();
    System.out.println("main(obj1):" + obj1);
    System.out.println("main(obj2):" + obj2);
    obj1.test();
    obj2.test();
  }
}
