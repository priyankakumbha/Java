class A< X extends Number>
{
  X obj;
}
class M24
{
  static void test(A<?> a1)
  {

  }
  public static void main(String[] args)
  {

    test(new A<Integer>());
    test(new A<Object>());
    test(new A<P>());
    test(new A<String>());
    test(new <Thread>());

    System.out.println("done");

  }
}
