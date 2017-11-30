class U
{
  int i;
  static U test()
  {
    U u1 = new U();// u1 is U type reference variable
    u1.i = 10;
    return u1;
  }
  public static void main(String[] args)
  {
    U obj = test();
    System.out.println(obj.i);
  }
}
//reference can be supplied to other method as a argument or returned to caller of the current method
