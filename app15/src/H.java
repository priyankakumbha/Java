class H
{
  public static void main(String[] args)
  {
    byte i = 10;
    Byte obj = Byte.valueOf(i);
    byte j = obj.byteValue();
    System.out.println(i == j);
  }
}
