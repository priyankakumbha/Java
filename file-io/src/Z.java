import java.io.*;
class Z
{
  public static void main(String[] args)
  throws IOException
    {
      FileWriter out = null;
      BufferWriter bout = null;
      try
      {
        new FileWriter("data4.txt", true);
        new BufferedWriter(out);
        bout.write("Hello to all");
        bout.newLine();
        bout.write("Hello to all");
        bout.write("Hello to all");
        bout.newLine();
        bout.write("Hello to all");
      }
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
      finally
      {
        try
        {
          if(bout != null)
          {
            bout.flush();
            bout.close();
            bout = null;
          }
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
        try
        {
          if(bout != null)
          {
            out.close();
            out = null;
          }
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
      }
      System.out.println("done");

  }
}
