import java.io.*;
class M
{
  public static void main(String[] args)
    {
      File f1 = new File("E:/priya");
      File f2 = new File(f1, "dir3");
      System.out.println(f2.exists());
      System.out.println(f2.mkdir());
      System.out.println(f2.exists());
  }
}
