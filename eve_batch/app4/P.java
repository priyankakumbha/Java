class P{
  public static void test()
  {
    System.out.println("from test");
  }
  static{
    System.out.println("from P.SIB");
  }
}
class Q{
  static{
    System.out.println("from Q.SIB");
  }
  public static void main(String[] args){
    System.out.println("main begin");
    P.test();//has to load and initialize
    System.out.println("--------");
    P.test();
    System.out.println("--------");
    P.test();
    System.out.println("--------");
    System.out.println("main end");
  }
}
