import java.util.ArrayList;
import java.util.Collections;
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
class M39
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();

    list.add(new A(90,9));
    list.add(new A(0, 90));
    list.add(new A(0, 90));
    list.add(new A(9, 100));
    list.add(new A(80 , 0));
    list.add(new A(5 , 80));
    list.add(new A(5 , 80));
    System.out.println(list);
    Collections.sort(list, (o1, o2) -> ((A)o1).i - ((A)o2).i);
    System.out.println(list);
    Collections.sort(list, (o1, o2) -> ((A)o1).j - ((A)o2).j);
    System.out.println(list);
  }
}
