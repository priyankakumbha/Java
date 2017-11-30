import java.util.ArrayList;
class M41
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(90);
    list.add(910);
    list.add(190);
    list.add(920);
    System.out.println(list);
    for(int i = 0; i < list.size(); i++)
    {
      System.out.println(list.get(i) + ",");
    }
    System.out.println();
    for(Object obj : list)
    {
      System.out.print(obj + ",");
    }
  }
}
