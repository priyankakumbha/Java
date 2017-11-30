class F
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = 10;
    assert i > 5 : "some thing went wrong";
    System.out.println("main end");
  }
}
