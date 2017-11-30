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
  A(int i)
  {
    this();
    System.out.println("A(int)");
  }

  {
    System.out.println("A-IIB");
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
  B(int i)
  {
    super(i);
    System.out.println("B(int)");
  }
  {
    System.out.println("B-IIB");
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
    this(90);
    System.out.println("C()");
  }
  C(int i)
  {
    super(i);
    System.out.println("C(int)");
  }
  {
    System.out.println("C-IIB");
  }
}
class Z6
{
  static{
    System.out.println("Z6-SIB");
  }
  public static void main(String[] args)
  {
System.out.println("main begin");
B b1 = new B();
System.out.println("-----");
A a1 = new A(10);
System.out.println("-----");
C c1 = new C(20);
System.out.println("-------");
A a2 = new A();
System.out.println("-------");
B b2 = new B();
System.out.println("-------");
C c2 = new C();
System.out.println("-------");
System.out.println("main end");
  }
}
