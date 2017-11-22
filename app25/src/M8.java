import java.util.ArrayList;
import java.util.Collections;
class A implements Comparable
{
  int i;
  A(int i)
  {
    this.i = i;
  }
  public String toString()
  {
    return "i = " + i;
  }
  public int compareTo(Object obj)
  {
    return i - ((A)obj).i;
  }
}
class M8
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(new A(90));
    list.add(new A(910));
    list.add(new A(9));
    list.add(new A(100));
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
