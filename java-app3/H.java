class H
{
  void test()
  {
    System.out.println("test:" + this);//reference variable available in constructor,iib and method non static
    //sib is satic that s why not available
    //this is not available in static member
  }
  public static void main(String[] args)
  {
    H h1 = new H();
    System.out.println("main:" + h1);//h1 is printing h1 adress
    h1.test();
  }
}
