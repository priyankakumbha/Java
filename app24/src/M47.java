class A
{

}
class M47
{
  public static void main(String[] args)
  {
    A a1 = new A();
    A a2 = new A();
    Class c1 = a1.getClass();
    Class c2 = a1.getClass();
    Class c3 = a2.getClass();
    System.out.println(c1 == c2);
    System.out.println(c2 == c3);
    
  }
}
