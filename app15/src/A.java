class A
{
  public static void main(String[] args)
  {
    int i = 10;
    Integer obj = new Integer(i);
    int j = obj.intValue();
    System.out.println(i == j);
  }
}
