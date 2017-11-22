import java.util.HashMap;
class M28
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    map.put(null, 1000);
    map.put("xyz", null);
    map.put(null, 3000);
    map.put("qst", null);
    System.out.println(map);
  }
}
