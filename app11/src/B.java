class A
{
  void test1()
  {
    System.out.println("from test1");
  }
  final void test2()
  {
    System.out.println("from test2");
  }
}
class B extends A
{
  void test1()
  {
    System.out.println("from test1");
  }
   void test2()
  {
    System.out.println("from test2");
  }
  // public static void main(String[] args)
  // {
  //   System.out.println("Hello world!");
  // }
}
