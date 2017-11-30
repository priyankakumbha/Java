class L {

  L(int i)
  {
    System.out.println("L(int i)");
  }
  L(int i, int j)
  {
    System.out.println("L(int ,int)");
  }
  public static void main(String[] args)
  {
L obj1 = new L(10);
    System.out.println("-----");
    L obj2 = new L(10,20);

  }
}
