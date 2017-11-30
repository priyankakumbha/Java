class T
{
  public static void main (String[] args)
  {
int i;
      for( i = 1, System.out.println("Initialization:" + i);
      i <= 5;
      i++, System.out.println("Increment:" + i))
      {
        System.out.println("body:" + i);
      }
System.out.println("end:" + i);
  }
}
