class F
{
static int counter;
F()
  {
  }

  F(int i)
  {
  }
  F(int i, int j)
  {
  }
  {
    counter ++;
  }
}
class Z6
{
  public static void main(String[] args)
  {
    F f1 = new F(10);
    F f2 = new F(1,0);
    F f3 = new F();
    F f4 = new F(10,30);
    F f5 = new F(30);
    F f6 = new F();
    System.out.println(F.counter);
  //IIB executing one time for one object.

  }
}
