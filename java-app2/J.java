class J {
  J()
  {
    System.out.println("J()");
  }
  J(int i)
  {
    System.out.println("J(int i)");
  }
  public static void main(String[] args)
  {
    J j1 = new J();
    System.out.println("------");
    J j2 = new J(20);
    System.out.println("------");
  }
}
