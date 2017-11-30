class C
{
  static
  {
    System.out.println("C-SIB");
  }
  C()
  {
    System.out.println("C()");
  }
  C()
  {
    System.out.println("C(int)");
  }
  public static void main(String[] args)
  {
    System.out.println("main begin");
    C c1 = new C();
    System.out.println("-----");
    C c2 = new C(20);
    System.out.println("-----");
    C c3 = new C();
    System.out.println("-----");
    C c4 = new C(2000);
    System.out.println("-----");
    System.out.println("main end");
  }
}
