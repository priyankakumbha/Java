class I
{
  public static void main(String[] args)
  {
  int i = 1;
  while(i <= 10)
    {
      System.out.println("loop begin:" + i);
      if(i >= 5)
      {
        System.out.println("if block:" + i);
        break;
      }
        System.out.println("loop end:" + i);
        i++;
    }
    System.out.println("main end:");
  }
}
