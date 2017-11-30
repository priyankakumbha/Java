class P
{
  static  int i;
  static  int j = i + 10;
  static  int k = i + j + 10;
  public static void main(String[] args)
  {
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
  }
}
