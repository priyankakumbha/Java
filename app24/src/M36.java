class A
{
  int i, j;
  A(int i, int j)
  {
    this.i = i;
    this.j = j;
  }
  public int hashCode()
  {
    return i + j;
  }
}
class M36
{
  public static void main(String[] args)
  {
  A a1 = new A(90, 10);
  A a2 = new A(90, 10);
  System.out.println(a1.hashCode());
  System.out.println(a2.hashCode());
  }
}
