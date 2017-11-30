class I implements Cloneable
{
  int x;
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    I obj1 = new I();
    obj1.x = 10;
    I obj2 = (I) obj1.clone();
    System.out.println(obj1.x);
    System.out.println(obj2.x);
    obj2.x = 20;
    System.out.println(obj1.x);
    System.out.println(obj2.x);
  }
}
