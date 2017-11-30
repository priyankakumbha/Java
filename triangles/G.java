class G {
  public static void main(String[] args)
  {
     for(int i = 1;i <= 6;i++)
     {
     for(int j=1;j <= i;j++)
     {
       if(i == 1 || i == 6)
               {
                   System.out.print(1);
               }
               else if(j == 1 || j == i)
               {
                   System.out.print(1);
                 }
                 else{
                   System.out.print(0);
                 }
     }
     System.out.println();
     }
    }
    }
