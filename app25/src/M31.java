import java.util.Hashtable;
class M31
{
  public static void main(String[] args)
  {
    Hashtable table = new Hashtable();
    table.put("test", 1000);
    table.put(100, 'a');
    table.put(2.3, null);
    table.put("qst", false);
    System.out.println(table);
  }
}
