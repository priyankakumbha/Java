import java.util.ArrayList;
import java.util.Collections;
class M5
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add("hello");
    list.add("abc");
    list.add("xyz");
    list.add("test");
    list.add("java");
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
