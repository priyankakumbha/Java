class A
{
  public static void main(String[] args)
  {
    for(int i = 1; i <= 10; i++)
    {
      System.out.println("begin:" + i);
      if(i >= 5)
      {
        continue;
      }
        System.out.println("end:" + i);
    }
  }
}
