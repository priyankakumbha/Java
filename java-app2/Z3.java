class C
{
  C()
  {
    System.out.println("C()");
  }
  {
    System.out.println("C-IIB");
  }
}
class Z3
{
  public static void main(String[] args)
  {
    C c1 = new C();
    System.out.println("-------");
    C c2 = new C();
    System.out.println("--------");
    C c3 = new C();
    System.out.println("-------");
  }
}
