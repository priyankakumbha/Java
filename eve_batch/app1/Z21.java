class Z21
{
  public static void main(String[] args)
  {
    System.out.println("main " );
    int i = 10;
    test(i++ + i);//10 + 11
    System.out.println("main end:" + i );
  }
  public static void test(int i)
  {
    System.out.println("test:" + i );
    i += 50;
  }
}
