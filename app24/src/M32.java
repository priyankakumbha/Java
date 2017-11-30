class A
{
  int i;
  A(int i)
  {
    this.i = i;
    public boolean equals(Object obj)
    {
        return (obj instanceof A) && (i == ((A)obj).i) ;
    }
  }
}
class B
{
  int i;
  A obj;
  B(int j, A obj)
{
  this.j = j;
  this.obj = obj;
}
public boolean equals(Object obj)
{
  return (obj onstanceof B) && (i == ((B)obj).i) ;
}
}
class M32
{
  public static void main(String[] args)
  {
A a1 = new A(90);
A a2 = new A(90);
B b1 = new B(90);
B b2 = new B(90);
System.out.println(a1.equals(a2));
System.out.println(b1.equals(b2));
System.out.println(b1.equals(a1));
System.out.println(a1.equals(b1));
  }
}
