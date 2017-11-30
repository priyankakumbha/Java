class M15
{
  public static void main(String[] args)
  {
    Thread t1 = Thread.currentThread();
    System.out.println("id:" + t1.getId());
    System.out.println("name:" + t1.getName());
    System.out.println("daemon:" + t1.isDaemon());
    System.out.println("priority:" + t1.getPriority());
  }
}
