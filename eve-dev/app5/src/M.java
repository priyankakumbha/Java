abstract class L {
  abstract void test1();
  void test2()
  {
    System.out.println("from test2");
  }
}
class M extends L {
  public static void main(String[] args)
  {
    System.out.println("done");
  }
}
