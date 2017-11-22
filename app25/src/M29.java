import java.util.Hashtable;
class M29
{
  public static void main(String[] args)
  {
    Hashtable table = new Hashtable();
    table.put("test", 1000);
    table.put("xyz", 'a');
    table.put(2.3, 3000);
    table.put("qst", false);
    System.out.println(table);
  }
}
