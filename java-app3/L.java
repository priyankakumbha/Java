class L
{
  int x;
  void test1()
  {
  System.out.println("from test1:" + this.x);//
  this.x = 2;
  this.test2();
  }
  void test2(){
    System.out.println("from test2:" + this.x);
    this.x = 3;
  }
  public static void main(String[] args)
  {
    L obj = new L();
    obj.x = 1;
    System.out.println("main1:" + obj.x);
    obj.test1();
    System.out.println("main2:" + obj.x);
    obj.x = 4;
    obj.test2();
    System.out.println("main1:" + obj.x);

  }
}
