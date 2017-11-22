
class A
{
  int i;
  A(int i)
  {
    this.i = i;
  }
}
class B
{
  int i;
  B(int i)
  {
    this.i = i;
  }
}


class L implements Cloneable
{
  A a1;
  B b1;
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    L obj1 = new L();
    obj1.a1 = new A(10);
    obj1.b1 = new B(100);
    L obj2 = (L) obj1.clone();
    System.out.println(obj1.a1.i);
    System.out.println(obj1.b1.i);
    System.out.println(obj2.a1.i);
    System.out.println(obj2.b1.i);
    obj1.a1.i = 20;
    obj1.b1.i = 200;
    System.out.println(obj1.a1.i);
    System.out.println(obj1.b1.i);
    System.out.println(obj2.a1.i);
    System.out.println(obj2.b1.i);
    obj2.a1.i = 30;
    obj2.b1.i = 300;
    System.out.println(obj1.a1.i);
    System.out.println(obj1.b1.i);
    System.out.println(obj2.a1.i);
    System.out.println(obj2.b1.i);
  }
}
