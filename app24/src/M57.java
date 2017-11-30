import java.util.Scanner;
import java.lang.reflect.Method;
class A
 {
   void test1()
   {
     System.out.println("A.test1");
   }
   void test2()
   {
     System.out.println("A.test2");
   }
 }
 class B
 {
   void method1()
   {
     System.out.println("B.method1");
   }
   void method2()
   {
     System.out.println("B.method2");
   }
 }

class M57
{
  public static void main(String[] args)
  throws Exception
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter class name");
    String className = sc.next();
    Class c1 = Class.forName(className);
    Object obj = c1.newInstance();
    Method[] methods = c1.getDeclaredMethods();
    System.out.println("Available methods in" + className);
    for(Method method : methods)
    {
      System.out.println(method.getName());
    }
    System.out.println("enter method name");
    String methodName = sc.next();
    Method method = c1.getDeclaredMethod(methodName);
    Object value = method.invoke(obj);
    System.out.println(value);
  }
}
