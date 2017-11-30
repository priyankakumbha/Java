class Z23
{
  public static void main(String[] args)
  {
    int i = test();
    System.out.println("main: " + i );

  }
  public static int test()
  {
    int i = 10;
    System.out.println("test:" + i );
   return i++;
  }
}
