class P
{
  P(int i, int j)
  {
    System.out.println("P(int i, int j)");
  }
  P(double i, int j)
  {
    System.out.println("P(double i, int j)");
  }
  public static void main(String[] args)
  {
    P p1 = new P(90, 2);
    System.out.println("-------");
    P p2 = new P(9.0, 2);
    System.out.println("-------");
  }
}
