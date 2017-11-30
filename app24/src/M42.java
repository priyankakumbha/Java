class A
{
  int i, j , k;
  A(int i, int j, int k)
  {
    this.i = i;
    this.j = j;
    this.k = k;
  }
  public int hashCode()
  {
    return Integer.toString(i).hashCode() +
           Integer.toString(j).hashCode()+
           Integer.toString(k).hashCode();
  }
}
class M42
{
  public static void main(String[] args)
  {
    A a1 = new A(10, 20, 30);
    A a2 = new A(10, 20, 30);
    A a3 = new A(20, 10, 30);
    A a4 = new A(10, 30, 20);
    A a5 = new A(30, 20, 10);
    A a6 = new A(30, 20, 100);
    System.out.println(a1.hashCode());
    System.out.println(a2.hashCode());
    System.out.println(a3.hashCode());
    System.out.println(a4.hashCode());
    System.out.println(a5.hashCode());
    System.out.println(a6.hashCode());

  }
}
