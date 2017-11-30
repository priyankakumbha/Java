class G
{
  static{
    System.out.println("G-SIB");//one time for one class
  }
  G()
  {
    System.out.println("G()");
  }
  G(int i)
  {
    this();
    System.out.println("G(int)");
  }
  {
  System.out.println("G-IIB");//one time for one object
  }
  public static void main(String[] args)
  {
    System.out.println("main begin");
    G g1 = new G();
    System.out.println("-----");
    G g2 = new G(20);
    System.out.println("-----");
    System.out.println("main end");
  }
}
