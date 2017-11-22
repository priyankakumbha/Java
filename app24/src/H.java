class H implements Cloneable
{
  int x;
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    H h1 = new H();
    h1.x = 10;
    H h2 = (H) h1.clone();
    System.out.println(h1.x);
    System.out.println(h2.x);
  }
}
