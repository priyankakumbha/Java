class C
{
  public static void main(String[] args)
  {
    double i = 1.5;
    Double obj = new Double(i);//boxing
    double j = obj.doubleValue();//un-boxing
    System.out.println(i == j);
  }
}
