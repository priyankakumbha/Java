class N
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    int i = 0;
    if(i++ == 1 || i++ == 1)
    {
      System.out.println("from if:" + i++);
    }
    System.out.println("main end:" + i);

  }
}
