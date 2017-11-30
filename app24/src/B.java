class B
{
protected void finalize()
{
System.out.println("from finalize");
}

  public static void main(String[] args) throws Throwable
  {
    B b1 = new B();
    b1 = null;
    try
  {
    Thread.sleep(10000);
  }
  catch (InterruptedException ex)
  {
    
  }
    System.out.println("done");
  }
}
