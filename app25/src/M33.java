import java.util.HashMap;
import java.util.TreeMap;
class M33
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    map.put("abc", 1000);
    map.put("xyz", 2000);
    map.put("test", 3000);
    map.put("qst", 4000);
    map.put("hello", 4000);
    map.put("java", 4000);
    TreeMap map1 = new TreeMap(map);
    System.out.println(map);
      System.out.println(map1);
  }
}
