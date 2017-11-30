class A
{
  static
  {
    System.out.println("from SIB.A");
  }
}
class M51
{
  public static void main(String[] args)
  throws ClassNotFoundException
  {
    A a1 = new A();
    System.out.println("------");
      Class c1 = Class.forName("A");
    Class c2 = a1.getClass();
    Class c3 = A.class;
    System.out.println(c1 == c2);
      System.out.println(c2 == c3);
  }
}
