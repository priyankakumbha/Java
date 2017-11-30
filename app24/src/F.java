class F
{
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    F f1 = new F();
    F f2 = (F) f1.clone();
    System.out.println(f1);
    System.out.println(f2);
  }
}
