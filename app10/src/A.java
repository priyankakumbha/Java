class A
{
  public static void main(String[] args)
  {
    int i = 10;
    final int j = 10;
    System.out.println(i);
    System.out.println(j);
    i = 10;
    j = 10;
    System.out.println(i);
    System.out.println(j);
  }
}
