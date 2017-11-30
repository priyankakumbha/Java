class A
{


  public static void main(String[] args) throws Throwable
  {
    A a1 = new A();
    a1.finalize();
    System.out.println("done");
  }
}
