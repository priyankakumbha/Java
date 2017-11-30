import java.util.HashSet;
class A
{
  int i;
  A(int i)
  {
    this.i = i;
  }
  public String toString()
  {
    return "i = " + i;
  }
}
class M18
{
  public static void main(String[] args)
  {
    HashSet set = new HashSet();
    System.out.println(set.add(new A(90)));
    System.out.println(set.add(new A(90)));
    System.out.println(set.add(new A(90)));
    System.out.println(set.add(new A(90)));
    System.out.println(set);
  }
}
