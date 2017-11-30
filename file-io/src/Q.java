import java.io.*;
class Q
{
  public static void main(String[] args)
  throws IOException
    {

      FileWriter out = new FileWriter("data2.txt");
      out.write("Hello to all\n");
      out.write("Hello \n to all");
      out.write("Hello to all");
      out.flush();
      out.close();
      System.out.println("done");

  }
}
