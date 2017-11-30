class F
{
  public static void main(String[] args)
  {
  for(int i = 1; i <= 5; i++)
  {
    System.out.println("outer begin:" + i);
    int j = 10;
    while (j <= 12){
      System.out.println("inner:" + i +"," +j);
      j++;
    }
        System.out.println("outer end:" + i );

      }
  }
}
