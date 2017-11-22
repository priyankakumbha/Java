import java.util.HashSet;
class M17
{
  public static void main(String[] args)
  {
    HashSet set = new HashSet();
    System.out.println(set.add(new StringBuffer("abc")));
    System.out.println(set.add(new StringBuffer("abc")));
    System.out.println(set.add(new StringBuffer("abc")));
    System.out.println(set.add(new StringBuffer("abc")));
    System.out.println(set);
  }
}
