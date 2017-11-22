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



class M13
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(new A(90, 7));
    list.add(new A(910, 68));
    list.add(new A(9, 4));
    list.add(new A(100, 20));
    System.out.println(list);
    Collections.sort(list, new Comparator()
    {
      public int compare(Object o1, Object o2)
      {
        return ((A)o1).i - ((A)o2).i;
      }
    });
    System.out.println(list);
    Collections.sort(list, new Comparator()
    {
      public int compare(Object o1, Object o2)
      {
        return ((A)o1).i - ((A)o2).i;
      }
    });
    System.out.println(list);
  }
}
