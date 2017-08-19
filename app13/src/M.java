class L
{
  class A {

  }
  static class B
  {

  }
}
  class M
  {
    public static void main(String[] args)
    {
      L.A a1 = new L().new A();
      L.B b1 = new L.B();
      System.out.println("done");
    }
  }
