class C
{
  public static void main(String[] args)
  {
    int i = 1;
    while(i <= 10)
    {

      System.out.println("begin:" + i);
      if(i >= 5)
      {
        continue;//it continurs next iteration
      }
        System.out.println("end:" + i);
        i++;
    }
  }
}
