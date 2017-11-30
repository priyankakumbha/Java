class L {
  public static void main(String[] args)
  {
    for(int i = 1; i <= 4; i++)
    {
      boolean flag = true;
      for(int j = 1; j <= 4; j++)
      {
        if(flag)
        {
          System.out.print(1);
          flag = false;
        }
        else
        {
          System.out.print(0);
          flag = true;
        }

      }
      System.out.println();
    }
  }
}
