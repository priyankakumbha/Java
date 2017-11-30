class V
{
  int i;
  static V test1()
  {
    V v1 = new V();
    test2(v1);
    return v1;
  }
  static void test2(V obj)
  {
    obj.i = 10;
  }
  public static void mian(String[] args)
  {
    V ref = test1();
    System.out.println(ref.i);
  }
  public static void mian(String[] args)
  {
    V v1 = new V();
    System.out.println("Hello World");
  }
}
