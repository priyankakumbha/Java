class A
{
  void test()
  {
    System.out.println("from A.test()");
    return 10;
  }
}
class T extends A
{
  double test()
  {
    System.out.println("from T.test()");
    return 1.10;
  }
  public static void main(String[] args)
  {
    T t1 = new T();
    t1.test();
    System.out.println("done");
  }
}
