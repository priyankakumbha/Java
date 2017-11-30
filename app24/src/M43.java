class A
{

}
class M43
{
  public static void main(String[] args)
  {
    A a1 = new A();
    a1.finalize();
    System.out.println("done");
  }
}
