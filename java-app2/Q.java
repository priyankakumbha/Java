class Q
{
  Q()
  {
    System.out.println("Q()");
  }
  Q(int i)
  {
    this();
    System.out.println("Q(int)");
  }
  public static void main (String[] args)
  {
    Q q1 = new Q();
    System.out.println("--------");
    Q q2 = new Q(10);
    System.out.println("--------");
  }
}
