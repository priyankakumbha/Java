class A
{
   static <T,S> S test(T obj1, S obj2)
   {
     return null;
   }
}
class M67
{
  public static void main(String[] args)
  {
  String s1 = A.<Integer, String>test(100, "abc");
    A.test(2000, "xyz");
    System.out.println("done with " + s1);

  }
}
