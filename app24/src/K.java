
class A
{
  int i;
  A(int i)
  {
    this.i = i;
  }
}


class K implements Cloneable
{
  A a1;
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    K obj1 = new K();
    obj1.a1 = new A(10);
    K obj2 = (K) obj1.clone();
    System.out.println(obj1.a1.i);
    System.out.println(obj2.a1.i);
    obj1.a1.i = 20;
    System.out.println(obj1.a1.i);
    System.out.println(obj2.a1.i);
    obj2.a1.i = 30;
    System.out.println(obj1.a1.i);
    System.out.println(obj2.a1.i);
  }
}
