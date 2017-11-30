class I {
  class A
  {

  }
  static class B
  {

  }
  public static void main(String[] args)
  {
    I obj = new I();
    A a1 = obj.new A();
    B b1 = new B();
    System.out.println("done");
  }
}
