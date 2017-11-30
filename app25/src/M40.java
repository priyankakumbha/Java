import java.util.Arrays;

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
class M40
{
  public static void main(String[] args)
  {
    A[] elements = {
    new A(90,9),
  new A(0, 90),
    new A(0, 90),
    new A(9, 100),
    new A(80 , 0),
    new A(5 , 80),
    new A(5 , 80)
  };
    System.out.println(Arrays.toString(elements));
    Collections.sort(elements,
     (o1, o2) -> ((A)o1).i - ((A)o2).i);
    System.out.println(Arrays.toString(elements));
    Collections.sort(elements, (o1, o2) -> ((A)o1).j - ((A)o2).j);
    System.out.println(Arrays.toString(elements));
  }
}
