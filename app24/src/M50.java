class A
{
  static
  {
    System.out.println("from SIB.A");
  }
}
class M50
{
  public static void main(String[] args)
  throws ClassNotFoundException
  {
    A a1 = new A();

    System.out.println("------");
      Class c1 = Class.forName("A");
    Class c2 = a1.getClass();
    System.out.println(c1 == c2);
  }
}
