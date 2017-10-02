class A
{
  int i;
  A(int i)
{
this.i = i;
}
}
class M16
{
  public static void main(String[] args)
  {
    A a1 = new A(90);
    A a2 = a1;
    System.out.println(a1 == a2);
  }
}
