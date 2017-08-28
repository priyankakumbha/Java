class F
{
  public static void main(String[] args)
  {
    String s1 = "90.6";
    Double obj = new Double(s1);//boxing
    byte i = obj.doubleValue();//un-boxing
    System.out.println(i);
  }
}
