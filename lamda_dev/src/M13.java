@FunctionalInterface
interface A
{
  int sum(int i, int j);
}

class M13
{
  public static void main(String[] args)
  {
     A a1 = (i,j) -> i+ j;
    int i = a1.sum(10, 20);
    System.out.println("done with" + i);
  }
}
