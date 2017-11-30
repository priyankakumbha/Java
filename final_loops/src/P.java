class P
{
  public static void main(String[] args)
  {
    loop1:
    for(int i = 1; i <= 5; i++)
    {
      System.out.println("outer loop begin:" + i);
      loop2:
      for(int j = 10; j <= 12; j++)
      {
        System.out.println("inner loop begin:" + j);
        if(j >= 11)
        {
          System.out.println("if block:" + j);
          break;
        }
        System.out.println("inner loop end:" + j);
      }
        System.out.println("outer  loop end:" + i);

    }
    System.out.println("main end:");
  }
}
