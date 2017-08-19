class M4
{
  public static void main(String[] args)
  {
    A a1 = null;
    C c1 = null;
    Object obj = null;
    E e1 = null;
    obj = a1;
    obj = e1;
    a1 = c1;
    a1 = e1;
    c1 = e1;
    System.out.println("done");
  }
}
