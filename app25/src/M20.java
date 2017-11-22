import java.util.HashSet;
class A
{
  int i, j;
  A(int i, int j)
  {
    this.i = i;
    this.j = j;
  }
  public String toString()
  {
    return "(i = " + i + ", j = " + j + ")";
  }
  public int hashCode()
  {
    return Integer.toString(i).hashCode() +
            Integer.toString(j).hashCode() ;
  }
  public boolean equals(Object obj)
  {
    return (obj instanceof A) &&
            (i == ((A)obj).i) &&
            (j == ((A)obj).j);
  }
}
class M20
{
  public static void main(String[] args)
  {
    HashSet set = new HashSet();
    System.out.println(set.add(new A(90, 80)));
    System.out.println(set.add(new A(90, 80)));
    System.out.println(set.add(new A(90, 80)));
    System.out.println(set.add(new A(90, 80)));
    System.out.println(set);
  }
}
