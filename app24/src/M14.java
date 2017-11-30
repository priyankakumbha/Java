class F
{
  int i;
  F(int i)
  {
    this.i = i;
  }
  public String toString()
  {
  return "i = " + i;
  }
}
class G extends F
{
  int i,j;
  G(int i, int j)
  {
    super(i);
    this.j = j;
  }
  public String toString()
  {
  return super.toString() + "j = " + j;
  }
}
class M14
{
  public static void main(String[] args)
  {
    F f1 = new F(10);
    G g1 = new G(10, 20);
    System.out.println(f1);
    System.out.println(g1);
  }
}
