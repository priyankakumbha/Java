import java.util.Scanner;
class N
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter something");
    String s1 = sc.next();
    try
    {
      System.out.println("try begin");
      int i = Integer.parseInt(s1);
      System.out.println("try end");
    }
    catch(NumberFormatException ex)
    {
      System.out.println("exception :" + ex);
    }
    System.out.println("end");
  }
}
