class H {
  void test()
  {
  System.out.println("from H.test");
  }
}
class I extends H
{
  void test()
  {
    System.out.println("from I.test");
  }
}
class J extends I
{
  void test()
  {
    System.out.println("from J.test");
  }
}

class M37
{
  public static void main(String[] args)
  {
    H[] elements = new H[3];
    elements[0] = new H();
    elements[1] = new I();
    elements[2] = new J();
    for(H element : elements)
    {
      element.test();
    }
  }
}
