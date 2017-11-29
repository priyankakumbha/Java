abstract class X
{
  X()
  {
    System.out.println("X()");
  }
}
class Y extends X
{
  Y()
  {
    System.out.println("Y()");
  }
  public static void main(String[] args)
  {
    Y obj = new Y();
    System.out.println("done");
  }
}
