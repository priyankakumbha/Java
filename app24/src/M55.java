import java.lang.reflect.Field;
class A
 {
   A()
   {
     System.out.println("A()");
   }
 }

class M55
{
  public static void main(String[] args)
  throws Exception
  {
      Class c1 = Class.forName("A");
        System.out.println("------");
      Object obj = c1.newInstance();
        System.out.println("-------");
      System.out.println("done");

  }
}
