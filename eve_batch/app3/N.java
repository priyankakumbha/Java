class N
{
  static  int i ;
  static  int j = i;
  static  int k = j;

  public static void main(String[] args)
  {
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);

  }
}
