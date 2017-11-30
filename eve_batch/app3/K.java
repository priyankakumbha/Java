class K
{
  static  int i = 1;

  public static void main(String[] args)
  {
    System.out.println(i);
    int i = 2;
    System.out.println(i);
    System.out.println(K.i);
    i = 3;
    System.out.println(i);
    System.out.println(K.i);
    K.i = 4;
    System.out.println(i);
    System.out.println(K.i);
  }
}
