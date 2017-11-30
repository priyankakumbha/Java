class U
{
  U()
  {
    System.out.println("U()");
  }
  U(int i)
  {
    this();
    System.out.println("U(int)");
  }
  {
    System.out.println("U-IIB");
  }
  public static void main(String[] args)
  {
    U u1 = new U();
    System.out.println("------");
    U u2 = new U(90);
  }
}
//iib 1 time for  1 object creation no matter how many constructors are going to execute
