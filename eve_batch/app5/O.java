class O
{
  int i;
  public static void main(String[] args)
  {
    O o1 = new O();
    O o2 = o1;
    O o3 = o2;
    O o4 = o3;
  o1.i = 1;
  o2.i = 2;
  o3.i = 3;
  o4.i = 4;
    System.out.println(o1.i);
    System.out.println(o2.i);
    System.out.println(o3.i);
    System.out.println(o4.i);
  }
}
