import java.lang.reflect.Field;
class A
{
  String param1;
  int param2;
  Double param3;

}
class M52
{
  public static void main(String[] args)
  throws ClassNotFoundException
  {
      Class c1 = Class.forName("A");
    Field[] fields = c1.getDeclaredFields();
    for(Field field : fields)
    {
      System.out.println(field.getName());
      System.out.println(":" + field.getType());
    }
    
  }
}
