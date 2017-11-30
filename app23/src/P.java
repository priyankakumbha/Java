
class P
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    assert false;
    System.out.println("----11----");
    pack1.pack11.A.test();
    System.out.println("----22----");
  pack2.pack22.A.test();
  System.out.println("----33----");
  pack1.A.test();
  System.out.println("----44----");
  pack2.A.test();
  System.out.println("----55----");
  System.out.println("main end");
  }
}
