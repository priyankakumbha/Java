import java.util.ArrayList;
import java.util.Collections;
class A implements Comparable
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
  public int compareTo(Object obj)
  {
    return i - ((A)obj).i;
  }
}
class M9
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(new A(90, 7));
    list.add(new A(910, 68));
    list.add(new A(9, 4));
    list.add(new A(100, 20));
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
