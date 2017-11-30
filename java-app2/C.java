class C {
  int i;
  C()
  {
    i = 10;

  }
  public static void main(String[] args)
  {
    C c1 = new C();
    System.out.println("-----");
    C c2 = new C();
    System.out.println("-----");

    System.out.println(c1.i + "," + c2.i);
  }
}
