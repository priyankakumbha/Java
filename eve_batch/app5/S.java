class S
{
  int i;
  static void test(S s1)//derived data type
  //method can take argument as class data type i.e. derived data type
  {
    System.out.println("from test:" + s1.i);
    s1.i = 20;// we can not use i straight away , have to use along with reference variable
  }
  public static void main(String[] args)
  {
    S obj = new S();
    obj.i = 10;
    System.out.println("from main1:" + obj.i);
    test(obj);
    System.out.println("from main2:" + obj.i);
  }
}
//obj is first reference and s1 is second reference from test method.
//obj can have any number of reference variables those can be from same or different method.
//Multiple refernces of one object can be from same method or another method
