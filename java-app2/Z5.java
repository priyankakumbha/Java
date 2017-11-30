class E
{

  {
    System.out.println("E-IIB");
  }
  E()
  {
    System.out.println("E()");
  }
  E(int i)
  {
    System.out.println("E(int i)");
  }
  E(int i, int j)
  {
    System.out.println("E(int, int)");
  }
}
class Z5
{
  public static void main(String[] args)
  {
    E e1 = new E();
    System.out.println("-------");
    E e2 = new E(10);
    System.out.println("--------");
    E e3 = new E(10,20);
    System.out.println("-------");
  }
}
