class R
{
  public static void main(String[] args)
  {
    System.out.println("main begin");
    if(true)
      if(false)//2nd block
         if(true)//it is skipped, this is part of body of 2nd block
             System.out.println("if3");
         else
              System.out.println("else1");//it is skipped
      else
         System.out.println("else2");//2nd block
  else
    System.out.println("else3");

  }
}
