class E
{
  public static void main(String[] args)
  {
    String s1 = "90";
    Byte obj = new Byte(s1);//boxing
    byte i = obj.byteValue();//un-boxing
    System.out.println(i);
  }
}
