class N
{
  N() throws ClassNotFoundException
  {

  }
}
class O extends N
{
  O()
  {
    try
    {
      super();
    }
    catch (ClassNotFoundException ex)
    {

    }
  }
  public static void main(String[] args)
    throws ClassNotFoundException
    {
      System.out.println("Hello world!");
    }

}
