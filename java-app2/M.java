class M {

  M(int i)
  {
    System.out.println("M(int i)");
  }
  M(double i)
  {
    System.out.println("M(double)");
  }
  public static void main(String[] args)
  {
M m1 = new M(90);
    System.out.println("-----");
    M m2 = new M(9.0);
        System.out.println("-----");
        M m3 = new M(9);
            System.out.println("-----");
            M m4 = new M(19.0);
                
  }
}
