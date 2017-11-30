class E
{
  public static void main(String[] args)
  {
    int i = 1;
    do
    {

      System.out.println("begin:" + i);
      i++;
      if(i >= 5)
      {
        continue;//it continurs next iteration
      }
        System.out.println("end:" + i);

    }while( i <= 10);
  }
}
