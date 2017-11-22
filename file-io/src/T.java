import java.io.*;
class T
{
  public static void main(String[] args)
  throws IOException
    {
      try(FileWriter out = new FileWriter("data3.txt", true))
      {
        out.write("Hello to all\t");
        out.write("Hello \t to all");
        out.write("Hello to all");
        out.flush();
        out.close();
      }
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
      System.out.println("done");
  }
}
