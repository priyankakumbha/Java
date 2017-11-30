class U
{
  U()
  {
    System.out.println("U()");
    this(90);//this calling statement should be first statement in the constructor body

  }
  U(int i)
  {
    System.out.println("U()");
  }
  public static void main (String[] args)
  {
    System.out.println("done");
  }
}
