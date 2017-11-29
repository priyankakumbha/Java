interface A
{
  void test1();
}

class B
{
  public void test1()
  {
    System.out.println("test1");
  }
}
class E extends B implements A
{
  public static void main(String[] args)
  {
    E e1 = new E();
    e1.test1();
    System.out.println("done");
  }
}
