import java.util.ArrayList;
import java.util.Iterator;
class M43
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(910);
    list.add(190);
    list.add(920);
    Iterator it = list.iterator();
    while(it.hasNext())
    {
    System.out.print(it.next() + ",");
    }
    System.out.println();
    
    while(it.hasNext())
    {
    System.out.print(it.next() + ",");
    }

  }
}
