class M
{
  int x;
  void test1()
  {
  System.out.println("from test1:" + x);//
x = 2;
  test2();
  }
  void test2(){
    System.out.println("from test2:" + x);
  x = 3;
  }
  public static void main(String[] args)
  {
    M obj = new M();
    obj.x = 1;
    System.out.println("main1:" + obj.x);
    obj.test1();
    System.out.println("main2:" + obj.x);
    obj.x = 4;
    obj.test2();
    System.out.println("main1:" + obj.x);

  }
}
