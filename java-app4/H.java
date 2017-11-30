class G
{
  G()
  {
    System.out.println("G()");
  }
}
class H extends G
{
  H()
  {
    super();
    System.out.println("H()");
  }
  public static void main(String[] args)
  {
    H h1 = new H();
    System.out.println("-----------");
    H h2 = new H();
    System.out.println("Hello world!");
  }
}
