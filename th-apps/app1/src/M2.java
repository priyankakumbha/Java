class A extends Thread
{
  public void run()
  {
    for(int i = 0; i < 100; i++)
    {
    System.out.println(i);
    }
  }
}


class M2
{
  public static void main(String[] args)
  {
    for(int i = 0; i < 1000; i++)
    {
      System.out.println(i);
    }
    for(int i = 200; i < 300; i++)
    {
      System.out.println(i);
    }
  }
}
