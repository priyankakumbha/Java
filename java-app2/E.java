class E {
  int i;

  E(int x)
  {
    i = x;
  }
  public static void main(String[] args)
  {
    E e1 = new E(10);
    E e2 = new E(20);
    E e3 = new E(30);
    System.out.println(e1.i + "," + e2.i + "," + e3.i);
  }
}
