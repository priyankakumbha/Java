import java.util.ArrayList;
import java.util.Collections;
class M4
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(9);
    list.add(null);
    list.add(50);
    list.add(5);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
