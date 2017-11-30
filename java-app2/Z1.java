class A
{
  static int counter;
  A()
  {
    counter ++;
  }
  A(int i)
  {

  }
}
class Z1
{

  public static void main(String[] args)
  {
    A a1 = new A();
    A a2 = new A(20);
    A a3 = new A();
    A a4 = new A(20);
    System.out.println(A.counter);
  }
}
