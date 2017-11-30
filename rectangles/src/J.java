class J {
  public static void main(String[] args)
  {
    for(int i = 1; i <= 4; i++)
    {
      for(int j = i; j <= (i + 6); j += 2)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
