class  D
{
  int i;
  D(int i)
  {
    this.i = i;
  }
}
class E
{
  int j;
  D obj;
  E(int j, D obj)
  {
    this.j = j;
    this.obj = obj;
  }
  public String toString()
  {
    return obj + ", j = " + j;
  }
}
class M11
{
  public static void main(String[] args)
  {
    E e1 = new E(20, new D(10));
    System.out.println(e1);
  }
}
