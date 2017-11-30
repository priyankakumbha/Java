import java.util.HashSet;
class M16
{
  public static void main(String[] args)
  {
    HashSet set = new HashSet();
    System.out.println(set.add("abc"));
    System.out.println(set.add("abc"));
    System.out.println(set.add("abc"));
    System.out.println(set.add("abc"));
    System.out.println(set);
  }
}
