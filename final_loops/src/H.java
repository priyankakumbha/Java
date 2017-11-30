class H
{
  public static void main(String[] args)
  {
  for(int i = 1; i <= 10; i++)
    {

      System.out.println("loop begin:" + i);

      if(i >= 5)
      {

        System.out.println("if block:" + i);
        break;

      }
        System.out.println("loop end:" + i);

    }
    System.out.println("main end:");
  }
}
