class S
{
  S()
  {
    System.out.println("S()");
  }
  S(int i)
  {
    System.out.println("S(int)");
  }
  {
    System.out.println("S-IIB");
  }
}
class T extends S
{
  T()
  {
    System.out.println("T()");
  }
  T(int i)
  {
    System.out.println("T(int)");
  }
  {
    System.out.println("T-IIB");
  }

  public static void main (String[] args)
  {
S s1 = new S();
System.out.println("-----");
S s2 = new S(10);
System.out.println("-----");
T t1 = new T(10);
System.out.println("-----");
T t2 = new T();
System.out.println("-----");
  }
}
