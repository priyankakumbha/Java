class A extends Thread
{
  public void run()
  {
      System.out.println("child begin");
      int i = 10/0;
      System.out.println("child end");
  }
}
class M33
{
  public static void main(String[] args)
  {
    A a1 = new A();
    a1.start();
    Util.sleep(5000);
    System.out.println("main end");
  }
}
