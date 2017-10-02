class A
{
  int i,j;
  double k;
  A(int i, int j, double k)
{
this.i = i;
this.j = j;
this.k = k;
}
public boolean equals(Object obj)
{
  boolean flag = (i == ((A)obj).i) && (j == ((A)obj).j) && (k == ((A)obj).k);
  return flag;
}
}
class M25
{
  public static void main(String[] args)
  {
    A a1 = new A(90, 100, 9.5);
    A a2 = new A(90, 100, 9.5);
    System.out.println(a1.equals(a2));
  }
}
