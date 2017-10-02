class Q
{
  public static void main(String[] args)
  {
    int i= 10;
    final int j;
    j = 10;
    switch(i)
    {
      case 5:
        System.out.println("from case 5");
        break;
      case j:
        System.out.println("from case 10");
        break;
      case 15:
        System.out.println("from case 15");
        break;
    }
  }
}
