class R
{
  R()
  {
    this(10);
    System.out.println("R()");
  }
  R(int i)
  {
    this();
    System.out.println("R(int)");
  }
  public static void main (String[] args)
  {
    R r1 = new R();
    System.out.println("--------");
    R r2 = new R(10);
    System.out.println("--------");
  }
}
