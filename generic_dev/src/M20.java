class A< X extends Number>
{
  X obj;
}
class M20
{
  public static void main(String[] args)
  {
    A<Number> a1 = new A<Number>();
    A<Byte> a2 = new A<Byte>();
    A<Short> a3 = new A<Short>();
    A<Integer> a4 = new A<Integer>();
    A<long> a1 = new A<long>();
    A<float> a1 = new A<float>();
    A<Double> a1 = new A<Double>();

  }
}
