class E
{
  static{
    System.out.println("E-SIB");
  }
  E()
  {
    System.out.println("E()");
  }
  {
    System.out.println("E-IIB");
  }
  public static void main(String[] args)
  {
    System.out.println("main begin");
    E e1 = new E();
    System.out.println("-----");
    E e2 = new E();
    System.out.println("-----");
    E e3 = new E();
    System.out.println("-----");
    System.out.println("main end");
  }
}
