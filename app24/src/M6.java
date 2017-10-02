class B
{
  int i,j;
  B(int i, int j)
{
  this.i = i;
  this.j = j;
}
public String toString()
{
  return "i = " + i + " , j = " + j;
}
}
class M6
{
  public static void main(String[] args)
  {
    B b1 = new B(10, 20);
    System.out.println(b1);

  }
}
