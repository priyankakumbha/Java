class C
{
  public static void main(String[] args)
  {
    System.out.println(1);
    test();
    System.out.println(2);
  }
  public static void test() throws ClassNotFoundException
{
  System.out.println(1);
  Class.forName("");
  System.out.println(2);
}

}
