interface A
{
  void test1();
}
interface B
{
  void test2();
}
interface C
{
  void test3();
}
class V implements A,B,C
{
  public void test1()
  {
    System.out.println("test1");
  }
  public void test2()
  {
    System.out.println("test2");
  }
  public void test3()
  {
    System.out.println("test3");
  }
  public static void main(String[] args)
  {
    V obj = new V();
    System.out.println("-------");
    obj.test1();
    System.out.println("-------");
    obj.test2();
    System.out.println("-------");
    obj.test3();

}

}
