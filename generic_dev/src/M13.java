class A < X >
{
  X obj;
  X test()
  {
    return obj;
  }
}
class M13
{
  public static void main(String[] args)
  {
    A<Integer> a1 = new A<Integer>();
    A<String> a2 = new A<String>();
    A<Double> a3 = new A<Double>();
    Integer obj1 = a1.test();
    Integer obj2 = a2.test();
    Integer obj3 = a3.test();
    System.out.println("done");
  }
}
