import java.util.HashMap;
class M26
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    map.put("abc", 1000);
    map.put("xyz", 1000);
    map.put(null, 1000);
    map.put("qst", 1000);
    System.out.println(map);
  }
}
