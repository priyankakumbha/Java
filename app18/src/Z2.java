class Z2
{
  public static void main(String[] args)
  {
    System.out.println(1);
    try
    {
        Class.forName("");
    }
  catch(ClassNotFoundException ex)
  {
  ex.printStackTrace();  
  }
    System.out.println(2);
  }
}
