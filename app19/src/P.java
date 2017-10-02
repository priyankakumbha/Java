import java.io.*;
class P
{
  public static void main(String[] args)
  {
    System.out.println(1);
    try
    {
      new FileWriter("");
    }
    catch(IOException ex)
    {
      System.out.println("catch");
    }
    System.out.println(2);
  }
}
