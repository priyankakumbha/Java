class A
{
  int i,j;
  A(int i)
{
this.i = i;

}
public boolean equals(Object obj)
{
  return i == ((A)obj).i;
}
}
class M23
{
  public static void main(String[] args)
  {
    A a1 = new A(90);
    A a2 = new A(900);
    System.out.println(a1.equals(a2));
  }
}
