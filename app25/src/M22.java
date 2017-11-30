import java.util.HashMap;
class M22
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    map.put("key1", 1000);
    map.put('a', 3000);
    map.put("key3", "test");
    map.put(true, 9000);
    System.out.println(map);
  }
}
