class R
{
  int i;
   void test1()
  {
    System.out.println("test1 begin");
    assert test2();
    System.out.println("test1 end");
  }
  boolean test2()
  {
    i = 20;
    return false;
  }
}
