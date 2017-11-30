class J
{
  int x;
  void test()
  {
    System.out.println("test:" + this.x);//this.x means obj.x
    this.x = 20;
  }
  public static void main(String[] args)
  {
    J obj = new J();
    obj.x = 10;
    System.out.println("main1:" + obj.x);
    obj.test();
    System.out.println("main2:" + obj.x);
  }
}
