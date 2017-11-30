import java.util.ArrayList;
import java.util.ListIterator;
class M51
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(910);
    list.add(190);
    list.add(920);
    ListIterator it = list.ListIterator();
    it.add(100);
    Object obj = null;
    while(it.hasNext())
    {
      obj = it.next();
      System.out.print(obj + ",");
    }
    System.out.println();
    System.out.println(list);
  }
}
