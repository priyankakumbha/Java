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
  public int hashCode()
  {
    return Integer.toString(i).hashCode();
  }
  public boolean equals(Object obj)
  {
    return (obj instanceof A) && (i == ((A)obj).i);
  }
}
class M19
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
