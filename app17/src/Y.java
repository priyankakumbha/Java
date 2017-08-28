class Y
{
  public static void main(String[] args)
  {
    catch(ArithmeticException ex)
    {
      System.out.println("from catch");
    }
    finally
    {
      System.out.println("finally");
    }
  }
}
