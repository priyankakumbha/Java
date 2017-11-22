class A extends Thread
{
  public void run()
  {
    for(int i =1; i <= 2000; i++ )
    {
      System.out.println("child:" + i );
    }
  }
}
class M25
{
  public static void main(String[] args)
  {

    A a1 = new A("FIRST CHILD THREAD");
    a1.start();
    System.out.println("main end");
  }
}
