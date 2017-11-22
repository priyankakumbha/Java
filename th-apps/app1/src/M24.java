class A extends Thread
{
  A(String name)
  {
    super(name);
  }
  public void run()
  {
    System.out.println("from child:");
    System.out.println("id:" + getId());
    System.out.println("Name:" + getName());
    System.out.println("priority:" + getPriority());
    System.out.println("daemon:" + isDaemon());
  }
}
class M24
{
  public static void main(String[] args)
  {

    A a1 = new A("FIRST CHILD THREAD");
    a1.start();

  }
}
