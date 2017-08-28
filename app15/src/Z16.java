class Z16
{
  // static void test(byte b1)
  // {
  //     System.out.println("from test");
  // }
  // static void test(Byte b1)
  // {
  //     System.out.println("from test(Byte)");
  // }
 static void test(Integer b1)
  {
    System.out.println("from test(Integer)");
  }
  static void test(Number b1)
   {
     System.out.println("from test(Number)");
   }
   static void test(Object b1)
    {
      System.out.println("from test(Object)");
    }
    static void test(byte ... b1)
     {
       System.out.println("from test(var arg)");
     }
  public static void main(String[] args)
  {
byte b1 = 20;
test(b1);
System.out.println("done");
  }
}
