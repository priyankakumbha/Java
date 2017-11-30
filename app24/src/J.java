class J implements Cloneable
{
  int x;
  String s1;
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    J obj1 = new J();
    obj1.x = 10;
    obj1.s1 = "abc";
    J obj2 = (J) obj1.clone();
    System.out.println(obj1.x);
    System.out.println(obj1.s1);
    System.out.println(obj2.x);
    System.out.println(obj2.s1);
    obj1.x = 20;
    obj1.s1 = "xyz";
    System.out.println(obj1.x);
    System.out.println(obj1.s1);
    System.out.println(obj2.x);
    System.out.println(obj2.s1);
  }
}
