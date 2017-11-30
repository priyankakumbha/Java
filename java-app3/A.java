class A
{
  static
  {
    System.out.println("A-SIB");
  }
  public static void main(String[] args)
  {
    System.out.println("main begin");
    A a1 = new A();
    System.out.println("-----");
    A a2 = new A();
    System.out.println("-----");
    A a3 = new A();
    System.out.println("-----");
System.out.println("main end");
//sib is not executing while object is creating
//class is loading to the memory at that time sib is executing
//sib mainly used for initializing static content
  }
}
