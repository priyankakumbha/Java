class A
{
  static{
    System.out.println("A-SIB");
  }
}
class B extends A
{
  static
  {
    System.out.println("B-SIB");
  }
}
class Z1 extends B
{
  static
  {
    System.out.println("Z1-SIB");
  }


  public static void main(String[] args)
  {
System.out.println("main begin");
B b1 = new B();
System.out.println("-----");
A a1 = new A();
System.out.println("-------");
System.out.println("main end");
  }

}
