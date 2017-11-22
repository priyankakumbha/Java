import java.util.ArrayList;
class A
{
  int i;
  A(int i)
  {
    this.i = i;
  }
}
class M6
{
  public static void main(String[] args)
  {
    ArrayList list = new ArrayList();
    list.add(new A(90));
    list.add(new A(910));
    System.out.println(list);

  }
}
