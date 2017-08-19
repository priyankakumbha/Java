class M39
{
  public static void main(String[] args)
  {
    A a1 = new B();//due to upcasting unable to use every member of every object
    System.out.println(a1.i);
    // System.out.println(a1.j);to acess j we have to do down casting
    if(a1 instanceof B)//have to take suggestion from instanceof operator
    {
      B b1 = (B) a1;//expilicitly downcasting
      System.out.println(b1.j);
    }
  }
}
