class B
{
  public static void main(String[] args)
  {
    byte i = 10;
    Byte obj = new Byte(i);//boxing
    byte j = obj.byteValue();//un-boxing
    System.out.println(i == j);
  }
}
