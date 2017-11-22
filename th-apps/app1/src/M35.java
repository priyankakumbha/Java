class A extends Thread
{
  public void run()
  {
      System.out.println("child begin");
      Util.sleep(10000);
      System.out.println("child end");
  }
}
class M35
{
  public static void main(String[] args)
  {
    A a1 = new A();
    a1.start();
    a1.start();
    System.out.println("main end");
  }
}
