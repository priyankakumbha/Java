class L{
  static int x = 10;
  static{
    System.out.println("L-SIB");
  }
}
class M {
  static{
    System.out.println("M-SIB");
  }
public static void main(String[] args)
{
  System.out.println("main begin");
  System.out.println(L.x);//loading and usuage
  System.out.println("--------");
  System.out.println(L.x);
  System.out.println("--------");
  System.out.println(L.x);
  System.out.println("--------");
  System.out.println("main end");
}
}
