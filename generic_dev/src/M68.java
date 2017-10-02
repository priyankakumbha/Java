class A
{
   static <T,S> S test(T obj1, S obj2)
   {
     return null;
   }
}
class M68
{
  public static void main(String[] args)
  {
    A a1 = new A();
  String s1 = a1.<Integer, String>test(100, "abc");
  int i = a1.<Integer, Integer>test(100, 500);
    A.test(2000, "xyz");
    System.out.println("done with " + s1);
    System.out.println("done with " + i);

  }
}
