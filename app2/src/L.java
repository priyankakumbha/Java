class L
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = 0;
    if(i++ == 0)
    {
      System.out.println("from if:" + i++);
    }
    System.out.println("main end:" + i);

  }
}
