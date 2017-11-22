import java.util.Hashtable;
class M30
{
  public static void main(String[] args)
  {
    Hashtable table = new Hashtable();
    table.put("test", 1000);
    table.put(null, 'a');
    table.put(2.3, 3000);
    table.put("qst", false);
    System.out.println(table);
  }
}
