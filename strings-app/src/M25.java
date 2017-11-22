class M25
{
  public static void main(String[] args)
  {
    String s1 = new String("HelloHello");
    System.out.println(s1);
    int i = s1.indexOf('e', 4);
    System.out.println(i);
    i = s1.indexOf('l', 6);
    System.out.println(i);
    i = s1.indexOf('H', 7);
    System.out.println(i);
  }
}
