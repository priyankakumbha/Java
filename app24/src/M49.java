class A
{
  static
  {
    System.out.println("from SIB.A");
  }
}
class M49
{
  public static void main(String[] args)
  throws ClassNotFoundException
  {
    Class c1 = Class.forName("A");
    System.out.println("------");
    A a1 = new A();
    Class c2 = a1.getClass();
    System.out.println(c1 == c2);
  }
}
