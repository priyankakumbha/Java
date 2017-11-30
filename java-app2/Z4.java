class D
{
  D()
  {
    System.out.println("D()");
  }
  D(int i)
  {
    System.out.println("D(int i)");
  }
  {
    System.out.println("D-IIB");//executing for every object creation
    //no matter which constructor
  }
}
class Z4
{
  public static void main(String[] args)
  {
    D d1 = new D();
    System.out.println("-------");
    D d2 = new D(20);
    System.out.println("--------");
    D d3 = new D(20);
    System.out.println("-------");
  }
}
