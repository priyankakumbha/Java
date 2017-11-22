import java.util.ArrayList;
import java.util.ListIterator;
class M50
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(910);
    list.add(190);
    list.add(920);
    ListIterator it = list.ListIterator();
    Object obj = null;
    while(it.hasNext())
    {
      obj = it.next();
      System.out.print(obj + ",");
    }
    System.out.println();
    while(it.hasPrevious())
    {
      obj = it.previous();
      System.out.print(obj + ",");
    }
    while(it.hasNext())
    {
      obj = it.next();
      System.out.print(obj + ",");
    }
  }
}
