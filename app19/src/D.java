class D
{
  public static void main(String[] args)
  {
    System.out.println(1);
  try
  {
    test();
  }
  catch (ClassNotFoundException ex)
  {
    System.out.println("catch");
  }
    System.out.println(2);
  }
  public static void test() throws ClassNotFoundException
{
  System.out.println(3);
  Class.forName("");
  System.out.println(4);
}

}
