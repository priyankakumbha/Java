class A < T >
{
  void method(T obj)
  {

  }
}
class M50
{
  static void test(A<? extends Number> arg)
  {
    arg.method(new Byte((byte)10));
  }

}
