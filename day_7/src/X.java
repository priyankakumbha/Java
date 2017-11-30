class X
{
  public static void main (String[] args)
  {
      int i = 10;
      for( ; ; )
      {
        System.out.println("body:" + i);
        i += 3;
      }
      System.out.println("end:" + i);
    }
}
