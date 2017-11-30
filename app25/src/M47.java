import java.util.ArrayList;
import java.util.Iterator;
class M47
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(910);
    list.add(190);
    list.add(920);
    Iterator it = list.iterator();
    Object obj = null;
    while(it.hasNext())
    {
      obj = it.next();
    System.out.print(obj + ",");
    }
    System.out.println();
    list.add(100);
    System.out.println(list);
  }
}
