class O {

  O()
  {
    System.out.println("O()");
  }
  O(int i)
  {
    System.out.println("O(int)");
  }
  O(double i)
  {
    System.out.println("O(double)");
  }
  public static void main(String[] args)
  {
O o1 = new O();
System.out.println("-----");
O o2 = new O(20);
System.out.println("-----");
O o3 = new O();
System.out.println("-----");
O o4 = new O(2.3);
System.out.println("-----");
O o5 = new O(40);
System.out.println("-----");

  }
}
