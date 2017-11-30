class A
{
  int i,j;
  A(int i, int j)
{
this.i = i;
this.j = j;
}
}
class M20
{
  public static void main(String[] args)
  {
    A a1 = new A(90, 100);
    A a2 = new A(90, 100);
    System.out.println(a1 == a2);
    System.out.println(a1.equals(a2));
    System.out.println(a1.i == a2.i);
  }
}
