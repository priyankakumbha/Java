class Z18
{
  public static void main(String[] args)
  {
    System.out.println("main " );
    int i = 10;
    test(i = 30);
    System.out.println("main end:" + i );
  }
  public static void test(int i)
  {
    System.out.println("test:" + i );
    i = 20;
  }
}
