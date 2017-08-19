class T
{
  public static void main(String[] args)
  {

    if(false)
      if(false)//2nd block,it is skipped, this is part of body of 2nd block
         if(false)//
             System.out.println("if3");
         else
              System.out.println("else1");//it is skipped
      else
         System.out.println("else2");//2nd block
  else
    System.out.println("else3");

  }
}
