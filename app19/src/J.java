class J
{
  public static void main(String[] args)
  {
    System.out.println(1);
    J obj = new J();
    try
    {
        obj.clone();
    }
  catch (ClassNotSupportedException ex)
{
  System.out.println("catch");
}
    System.out.println(2);
  }
}
