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
class M4
{
  public static void main(String[] args)
  {
    A a1 = new A();
    a1.run();
    for(int i = 200; i < 300; i++)
    {
      System.out.println(i);
    }
  }
}
