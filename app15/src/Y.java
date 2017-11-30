class Y
{
  static int test(Integer obj)
  {
    return obj;//obj.intValue()
  }
  public static void main(String[] args)
  {
    int i = 10;
    Integer j = test(i);//new Integer(test(new Integer(i)));
    System.out.println("done");
  }

}
