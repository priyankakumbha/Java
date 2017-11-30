class G
{
  public static void main(String[] args)
  {
    System.out.println(1);
    try
    {
      Thread.sleep(90);
    }
    catch (InterruptedException ex)
    {
      System.out.println("catch");
    }
    System.out.println(2);
  }
}
