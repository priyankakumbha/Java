class N
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    if(false)
    {
      System.out.println("from if");
    }
    else if(true)
    {
      System.out.println("from else if1");
    }
    else if(false)
    {
      System.out.println("from else if2");
    }
    else if(true){
      System.out.println("from else if3");
    }
    System.out.println("main end");
  }
}
