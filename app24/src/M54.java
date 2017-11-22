import java.lang.reflect.Method;

class M54
{
  public static void main(String[] args)
  throws ClassNotFoundException
  {
      Class c1 = Class.forName("java.lang.String");
    Method[] methods = c1.getDeclaredMethods();
    for(Method method : methods)
    {
      System.out.println(method.getName());
      System.out.println(":" + method.getReturnType());
    }

  }
}
