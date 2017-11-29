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
  P test()
  {
    System.out.println("from A.test()");
    return null;
  }
}
class V extends A
{
  R test()//co-variant
  {
    System.out.println("from V.test()");
    return null;
  }
  public static void main(String[] args)
  {

    System.out.println("done");
  }
}
