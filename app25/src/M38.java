import java.util.PriorityQueue;
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
class M38
{
  public static void main(String[] args)
  {
    PriorityQueue queue1 = new PriorityQueue (
    (o1, o2) -> ((A)o1).i - ((A)o2).i);
    queue1.add(new A(90,9));
    queue1.add(new A(0, 90));
    queue1.add(new A(0, 90));
    queue1.add(new A(9, 100));
    queue1.add(new A(80 , 0));
    queue1.add(new A(5 , 80));
    queue1.add(new A(5 , 80));
    System.out.println(queue1);
    System.out.println(queue1.poll());

    PriorityQueue queue2 = new PriorityQueue(
    (o1, o2) -> ((A)o1).j - ((A)o2).j);
    queue2.add(new A(90,9));
    queue2.add(new A(0, 90));
    queue2.add(new A(9, 100));
    queue2.add(new A(80 , 0));
    queue2.add(new A(80 , 0));
    queue2.add(new A(5 , 80));
    queue2.add(new A(5 , 80));
    System.out.println(queue2);
  }
}
