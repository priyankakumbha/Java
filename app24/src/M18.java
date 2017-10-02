class A
{
  int i;
  A(int i)
{
this.i = i;
}
}
class M18
{
  public static void main(String[] args)
  {
    A a1 = new A(90);
    A a2 = new A(90);
    System.out.println(a1 == a2);
    System.out.println(a1.equals(a2));
    System.out.println(a1.i == a2.i);
  }
}
