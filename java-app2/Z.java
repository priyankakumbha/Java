class Z
{
  static int counter;
  Z()
  {
    counter ++;
  }

  public static void main (String[] args)
  {
    Z z1 = new Z();
    Z z2 = new Z();
    Z z3 = new Z();

    System.out.println(z1.counter);//keeping z.counter
    System.out.println(z2.counter);//keeping z.counter
    System.out.println(z3.counter);//keeping z.counter
//compiler replacing 
  }
}
