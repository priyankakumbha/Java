import java.io.*;
class J
{
  public static void main(String[] args)
    {
      File f1 = new File("E:/priya/dir1");
      System.out.println(f1.exists());
      System.out.println(f1.mkdir());
      System.out.println(f1.exists());
  }
}
