import java.util.Scanner;
class A
 {
   A()
   {
     System.out.println("A()");
   }
 }
 class B
 {
   B()
   {
     System.out.println("B()");
   }
 }

class M56
{
  public static void main(String[] args)
  throws Exception
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter class name");
    String className = sc.next();
      Class c1 = Class.forName(className);
        System.out.println("------");
      Object obj = c1.newInstance();
        System.out.println("-------");
      System.out.println("done");

  }
}
