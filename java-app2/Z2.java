class B
{
  static int counter;
  B()
  {
    counter ++;
  }
  B(int i)
  {
    counter ++;
  }
}
class Z2
{
  public static void main(String[] args)
  {
      B b1 = new B();
      B b2 = new B(10);
      B b3 = new B();
      B b4 = new B(20);
      System.out.println(B.counter);
  }
}
