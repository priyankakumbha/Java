class A extends Thread
{
  public void run()
  {
    System.out.println("from child:");
    System.out.println("id:" + getId());
    System.out.println("Name:" + getName());
    System.out.println("priority:" + getPriority());
    System.out.println("daemon:" + isDaemon());
  }
}
class M23
{
  public static void main(String[] args)
  {

    A a1 = new A();
    a1.setName("FIRST CHILD THREAD");
    a1.start();

  }
}
