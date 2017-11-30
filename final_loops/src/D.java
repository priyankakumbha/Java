class D
{
  public static void main(String[] args)
  {
    int i = 1;
    do
    {

      System.out.println("begin:" + i);
      if(i >= 5)
      {
        continue;//it continurs next iteration
      }
        System.out.println("end:" + i);
        i++;
    }while( i <= 10);
  }
}
