import java.util.TreeSet;
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
    return "(" + i + "," + j + ")";
  }
  public int hashCode()
  {
    return Integer.toString(i).hashCode() +
          Integer.toString(j).hashCode();
  }
  public boolean equals(Object obj)
  {
    return (obj instanceof A) &&
            (i == ((A)obj).i) &&
            (j == ((A)obj).j);
  }
}
class M37
{
  public static void main(String[] args)
  {
    TreeSet set1 = new  TreeSet(
    (o1, o2) -> ((A)o1).i - ((A)o2).i);
    set1.add(new A(90,9));
    set1.add(new A(0, 90));
    set1.add(new A(0, 90));
    set1.add(new A(9, 100));
    set1.add(new A(80 , 0));
    set1.add(new A(5 , 80));
    set1.add(new A(5 , 80));
    System.out.println(set1);

    TreeSet set2 = new  TreeSet(
    (o1, o2) -> ((A)o1).j - ((A)o2).j);
    set2.add(new A(90,9));
    set2.add(new A(0, 90));
    set2.add(new A(9, 100));
    set2.add(new A(80 , 0));
    set2.add(new A(5 , 80));
    System.out.println(set2);
  }
}
