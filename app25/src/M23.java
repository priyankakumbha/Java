import java.util.HashMap;
class M23
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    System.out.println(map.put("key1", 1000));
    System.out.println(map);
    System.out.println(map.put("key1", 2000));
    System.out.println(map);
    System.out.println(map.put("key1", 5000));
    System.out.println(map);
    System.out.println(map.put("key1", 7000));
    System.out.println(map);
  }
}
