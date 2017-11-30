class Q
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    if(true)
      if(true)//2nd block
         if(true)//1st block
             System.out.println("if3");
         else
              System.out.println("else1");//1st block
      else
         System.out.println("else2");//2nd block
  else
    System.out.println("else3");

  }
}
