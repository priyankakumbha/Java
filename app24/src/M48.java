class A
{

}
class M48
{
  public static void main(String[] args)
  {
  String s1 = "abc";
  String s2 = "xyz";
  String s3 = new String("hello");
    Class c1 = s1.getClass();
    Class c2 = s1.getClass();
    Class c3 = s3.getClass();
    System.out.println(c1 == c2);
    System.out.println(c2 == c3);

  }
}
