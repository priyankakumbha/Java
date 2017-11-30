class A
{
  static
  {
    System.out.println("SIB-A");
  }
  A()
  {
    System.out.println("A()");
  }

}
class B extends A
{
  static
  {
    System.out.println("SIB-B");
  }
  B()
  {
    System.out.println("B()");
  }

}
class C extends B
{
  static
  {
    System.out.println("SIB-C");
  }
  C()
  {
    System.out.println("C()");
  }

}
class Z2
{
  static{
    System.out.println("Z2-SIB");
  }
  public static void main(String[] args)
  {
System.out.println("main begin");
B b1 = new B();
System.out.println("-----");
A a1 = new A();
System.out.println("-----");
C c1 = new C();
System.out.println("-------");
System.out.println("main end");
  }
}
