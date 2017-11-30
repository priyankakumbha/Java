class L
{
  public static void main(String[] args)
  {
    int i = 10;
    test();
    System.out.println("main:" + i);
}
static void test()
{
  int i = 20;
  System.out.println("test:" + i);
}

}
