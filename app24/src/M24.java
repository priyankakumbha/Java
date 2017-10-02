class A
{
  int i,j;
  A(int i, int j)
{
this.i = i;
this.j = j;
}
public boolean equals(Object obj)
{
  return i == ((A)obj).i && j == ((A)obj).j;
}
}
class M24
{
  public static void main(String[] args)
  {
    A a1 = new A(90, 100);
    A a2 = new A(90, 100);
    System.out.println(a1.equals(a2));
  }
}
