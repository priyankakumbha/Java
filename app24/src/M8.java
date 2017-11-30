class C
{
  int i;
  C(int i)
  {
    this.i = i;
  }
}
class M8
{
  public static void main(String[] args)
  {
    C c1 = null;
    System.out.println(c1);
    String s1 = "state of the object:" + c1;
    System.out.println(s1);
  }
}
