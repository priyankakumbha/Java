class Q
{
public static void main(String[] args)
{
  try{
    System.out.println("from try");
  }
  catch(ArithmeticException ex1)
  {
    System.out.println("from first catch:" + ex1);
  }
  catch(ArithmeticException ex2)
  {
    System.out.println("from second catch:" + ex2);
  }
}
}
