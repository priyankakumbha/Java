import java.lang.reflect.Method;
class A
{
  String getParam1()
  {
    return null;
  }
  void test1()
  {

  }
  Double test2()
  {
    return null;
  }

}
class M53
{
  public static void main(String[] args)
  throws ClassNotFoundException
  {
      Class c1 = Class.forName("A");
    Method[] methods = c1.getDeclaredMethods();
    for(Method method : methods)
    {
      System.out.println(method.getName());
      System.out.println(":" + method.getReturnType());
    }

  }
}
