interface A  {
void test1();
}
class G implements A
{
  public void test1(int i)
  {
    System.out.println("from test1(int)");
  }
  public static void main(String[] args)
  {
    System.out.println("done");
  }
}
