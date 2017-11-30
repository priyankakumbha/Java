class Z25
{
  public static void main(String[] args)
  {
    int i = 10;
    i = test(++i + i);//11+11
    System.out.println("main: " + i );
  }
  public static int test(int i)
  {
    System.out.println("test:" + i );
   return i++ + i;//22+23
  }
}
