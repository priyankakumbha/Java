class K
{
  private K(){
System.out.println("k()");
  }
  }
  class L extends K
  {
    L()
    {
      System.out.println("L()");
    }
  public static void main(String[] args)
  {
    System.out.println("done");
  }
}
