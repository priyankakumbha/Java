import java.io.*;
class Y
{
  public static void main(String[] args)
  throws IOException
    {
      FileWriter out = new FileWriter("data4.txt");
      BufferWriter bout = new BufferedWriter(out);
      bout.write("Hello to all");
      bout.newLine();
      bout.write("Hello to all");
      bout.write("Hello to all");
      bout.newLine();
      bout.write("Hello to all");
      bout.flush();
      bout.close();
      out.close();
      System.out.println("done");

  }
}
