import java.io.*;
class N
{
  public static void main(String[] args)
    {
      File f1 = new File("abc.txt");
      File f2 = new File("dir1");
      System.out.println(f1.isFile());
      System.out.println(f2.isFile());
      System.out.println(f1.isDirectory());
      System.out.println(f2.isDirectory());

  }
}
