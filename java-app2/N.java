class N {

  N(int i, int j)
  {
    System.out.println("N(int, int)");
  }
  N(int i, double j)
  {
    System.out.println("N(int, double)");
  }
  public static void main(String[] args)
  {
N n1 = new N(1, 2);
    System.out.println("-----");
    N n2 = new N(1, 2.5);
        System.out.println("-----");

  }
}
