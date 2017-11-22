import java.util.HashMap;
class M27
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    map.put(null, 1000);
    map.put("xyz", 2000);
    map.put(null, 3000);
    map.put("qst", 4000);
    System.out.println(map);
  }
}
