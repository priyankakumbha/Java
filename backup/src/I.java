class I
{
  public static void main(String[] args)
  {
    int i = 1;
  do
  {
    System.out.println("outer begin:" + i);
    int j = 10;
    do
    {
      System.out.println("inner:" + i +"," +j);
      j++;
    }while(j <= 12);
        System.out.println("outer end:" + i );
        i++;

      }while(i <= 5);
  }
}
