import java.util.TreeMap;
class A
{
  int i, j;
  A(int i, int j)
  {
    this.i = i;
    this.j = j;
  }
  public String toString()
  {
    return "(" + i + "," + j + ")";
  }
  public int hashCode()
  {
    return Integer.toString(i).hashCode() +
          Integer.toString(j).hashCode();
  }
  public boolean equals(Object obj)
  {
    return (obj instanceof A) &&
            (i == ((A)obj).i) &&
            (j == ((A)obj).j);
  }
}
class M36
{
  public static void main(String[] args)
  {
    TreeMap map1 = new  TreeMap(
    (o1, o2) -> ((A)o1).i - ((A)o2).i);
    map1.put(new A(90,9), "abc");
    map1.put(new A(0, 90), "xyz");
    map1.put(new A(9, 100), "test");
    map1.put(new A(80 , 0), "hello");
    map1.put(new A(5 , 80), "java");
    System.out.println(map1);

    TreeMap map2 = new  TreeMap(
    (o1, o2) -> ((A)o1).j - ((A)o2).j);
    map1.put(new A(90,9), "abc");
    map1.put(new A(0, 90), "xyz");
    map1.put(new A(9, 100), "test");
    map1.put(new A(80 , 0), "hello");
    map1.put(new A(5 , 80), "java");
    System.out.println(map2);
  }
}
