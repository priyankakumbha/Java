import java.util.Scanner;
class U
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter some thing");
  String s1 = sc.next();
  try
  {
    System.out.println("try begin");
    int i = Integer.parseInt(s1);
    System.out.println("-----");
    int j = 10/ (i-10);
    System.out.println("try end");
  }
  catch(ArithmeticException ex)
  {
System.out.println("from catch:" + ex);
  }
  finally
  {
    System.out.println("from finally");
  }
  System.out.println("main end");
}
}
