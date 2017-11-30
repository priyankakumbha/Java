class Z24
{
  public static void main(String[] args)
  {
    int i = 10;
    i = test(i++);
    System.out.println("main: " + i );
  }
  public static int test(int i)
  {
    System.out.println("test:" + i );
   return i++;
  }
}
