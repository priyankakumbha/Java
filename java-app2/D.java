class D {
  int i;
  int j;
  D()
  {
    i = 10;
    j = 20;
  }
  public static void main(String[] args)
  {
    D d1 = new D();
    D d2 = new D();
    System.out.println(d1.i + "," + d1.j);
    System.out.println(d2.i + "," + d2.j);
  }
}
