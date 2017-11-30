class A
{
  static
  {
    System.out.println("from A-SIB");
  }
}
class Y extends A
{
  static{
    System.out.println("FROM Y-SIB");
  }
  public static void main(String[] args)
  {
    System.out.println("main begin");
  }
}
