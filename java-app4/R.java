class Q
{
  Q()
  {
    System.out.println("Q()");
  }
  {
    System.out.println("Q-IIB1");
    System.out.println("Q-IIB2");
  }
  {
    System.out.println("Q-IIB3");
    System.out.println("Q-IIB4");
  }
}
class R extends Q
{
  R()
  {
    System.out.println("R()");
  }
  {
    System.out.println("R-IIB1");
    System.out.println("R-IIB2");
  }
  {
    System.out.println("R-IIB3");
    System.out.println("R-IIB4");
  }
  public static void main(String[] args)
  {
Q q1 = new Q();
System.out.println("------");
R r1 = new R();
  }
}
