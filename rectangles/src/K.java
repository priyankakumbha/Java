class K {
  public static void main(String[] args)
  {
    for(int i = 1; i <= 5; i++)
    {
      for(int j = 1, k=3; j <= 5; j++)
      {
        if(j <3 )
        {
          System.out.print(k--);
        }
        else
        {
          System.out.print(k++);
        }

      }
      System.out.println();
    }
  }
}
