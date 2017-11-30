class X
{
  int i;
  X()
  {
    i++;
  }

  public static void main (String[] args)
  {
    X x1 = new X();
    X x2 = new X();
    System.out.println(x1.i);
    System.out.println(x2.i);
  }
}
