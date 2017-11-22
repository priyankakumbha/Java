import java.io.*;
class Z1
{
  public static void main(String[] args)
    {
      try(FileWriter out = new FileWriter("data4.txt", true);
       BufferWriter bout = new BufferWriter(out))

      {
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
      System.out.println("done");

  }
}
