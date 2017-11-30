class K
{
  public static void main(String[] args)
  {
for(int i = 1; i <= 5; i++)
    {
      System.out.println("outer loop begin:" + i);
      for(int j = 10; j <= 12; j++)
      {
        System.out.println("inner loop begin:" + i);
        if(j >= 11)
        {
          System.out.println("if block:" + i);
          continue;
        }
        System.out.println("inner loop end:" + i);
      }
        System.out.println("outer loop end:" + i);
        i++;
    }
    System.out.println("main end:");
  }
}
