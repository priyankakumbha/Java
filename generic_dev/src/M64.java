class A
{
   static <T> void test(T obj1, T obj2)
   {
   }
}
class M64
{
  public static void main(String[] args)
  {
    A.test(100, 200);
    A.test("abc", "xyz");
    System.out.println("done");

  }
}
