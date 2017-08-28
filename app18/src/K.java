import java.util.Scanner;
class K
{
  public static void main(String[] args)
  {
    System.out.println("main-begin");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter some thing");
    String s1 = sc.next();
    int i = test(s1);
    System.out.println("main-end:" + i);
  }
  static int test(String s1)
  {
    try
    {
      System.out.println("try-begin");
      int i = Integer.parseInt(s1);
      System.out.println("try-end");
      return i;
    }
    catch (NumberFormatException ex)
    {
      System.out.println("catch begin");
      System.out.println("catch end");
      return 0;
    }
    finally
    {
      System.out.println("from finally");
      return -1;
    }
  }
}
