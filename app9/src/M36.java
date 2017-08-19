class F {
  void test()
  {
  System.out.println("from F.test");
  }
}
class G extends F
{
  void test()
  {
    System.out.println("from G.test");
  }
}
class M36
{
  public static void main(String[] args)
  {
    F[] elements = new F[2];
    elements[0] = new F();
    elements[1] = new G();
    for(F element : elements)
    {
      element.test();
    }
  }
}
