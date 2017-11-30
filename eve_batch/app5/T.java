class T
{
  int i;
  static void test(T t1, T t2)//
  {
    int x = t1.i;
    t1.i = t2.i;
    t2.i = x;
  }
  public static void main(String[] args)
  {
    T t1 = new T();
    T t2 = new T();
    //t1 and t2 are local method
    t1.i = 1;
    t2.i = 2;
    System.out.println(t1.i + "," + t2.i);
    test(t1,t2);
    System.out.println(t1.i + "," + t2.i);

  }
}
