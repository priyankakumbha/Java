class P
{

}
class Q extends P{

}
class R extends Q
{

}
class A
{
  R test()
  {
    System.out.println("from A.test()");
    return null;
  }
}
class W extends A
{
  Q test()//co-variant
  {
    System.out.println("from W.test()");
    return null;
  }
  public static void main(String[] args)
  {
    System.out.println("done");
  }
}
