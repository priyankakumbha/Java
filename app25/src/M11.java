import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    return "(" + i + "," + j +")";
  }

}
class B implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    return ((B)o1).i - ((B)o2).i;
  }
}
class C implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    return ((B)o1).j - ((B)o2).j;
  }
}


class M11
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(new A(90, 7));
    list.add(new A(910, 68));
    list.add(new A(9, 4));
    list.add(new A(100, 20));
    System.out.println(list);
    Collections.sort(list, new B());
    System.out.println(list);
    Collections.sort(list, new C());
    System.out.println(list);
  }
}
