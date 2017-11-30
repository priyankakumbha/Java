import java.io.*;
class R
{
  public static void main(String[] args)
  throws IOException
    {

      FileWriter out = new FileWriter("data3.txt", true);
      out.write("Hello to all\t");
      out.write("Hello \t to all");
      out.write("Hello to all");
      out.flush();
      out.close();
      System.out.println("done");

  }
}
