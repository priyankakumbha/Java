class I
{
  public static void main(String[] args)
  {
    float i = 10;
    Float obj = Float.valueOf(i);
    float j = obj.floatValue();
    System.out.println(i == j);
  }
}
