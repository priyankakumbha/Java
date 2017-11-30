class K
{
  int x;
  void test()
  {
    System.out.println("test:" + x);//this.x means obj.x
  x = 20;
  }
  public static void main(String[] args)
  {
    K obj = new K();
    obj.x = 10;
    System.out.println("main1:" + obj.x);
    obj.test();
    System.out.println("main2:" + obj.x);
  }
}
