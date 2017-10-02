class A
{
  int i;
  A(int i)
{
  this.i = i;
}
}
class M1
{
  public static void main(String[] args)
  {
    A a1 = new A(10);
    System.out.println(a1);
  }
}
