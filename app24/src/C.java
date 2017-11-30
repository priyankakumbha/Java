class C
{
  static C obj;
protected void finalize()
{
System.out.println("from finalize");
obj = this;
}
class M44
{
  public static void main(String[] args) throws Throwable
  {
    C c1 = new C();
    System.out.println(1 + ":" + c1 + ", " + C.obj);
    c1 = null;
    System.gc();
    try
    {

    }
 catch (InterruptedException ex)
 {

 }
   System.out.println(2 + ":" + c1 + ", " + C.obj);
C.obj = null;
System.gc();
try
{
  Thread.sleep(10000);
}
catch (InterruptedException ex)
{

}
System.out.println(3 + ":" + c1 + ", " + C.obj);
  }

}
