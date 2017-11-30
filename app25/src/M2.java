import java.util.ArrayList;
import java.util.Collections;

class M2
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(9.0);
    list.add("abc");
    list.add(true);
    list.add('r');
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
