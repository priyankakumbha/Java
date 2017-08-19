class K {
  class A
  {

  }
  static class B
  {

  }
  public static void main(String[] args)
  {

    A a1 = new K().new A();
    B b1 = new K.B();//object is not creating to k, we are using new operator for b class not K
    System.out.println("done");
  }
}
