class A
{
  int i, j;
  double p,q;
  A(int i, int j, double p, double q)
  {
    this.i = i;
    this.j = j;
    this.p = p;
    this.q = q;
  }
  public int hashCode()
  {
    String s1 = Integer.toString(i);
    String s2 = Integer.toString(j);
    String s3 = Double.toString(p);
    String s4 = Double.toString(q);
    int x = s1.hashCode();
    int y = s2.hashCode();
    int z = s3.hashCode();
    int z1 = s4.hashCode();
    int hash = x+y+ z+ z1;
    return hash;

  }
}
class M38
{
  public static void main(String[] args)
  {
  A a1 = new A(90, 10, 1.5, 35.6);
  A a2 = new A(90, 10,  1.5, 35.6);
  System.out.println(a1.hashCode());
  System.out.println(a2.hashCode());
  }
}
