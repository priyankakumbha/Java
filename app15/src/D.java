class D
{
  public static void main(String[] args)
  {
    String s1 = "90";
    Integer obj = new Integer(s1);//boxing
    int i = obj.intValue();//un-boxing
    System.out.println(i);
  }
}
