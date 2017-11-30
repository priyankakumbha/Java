import java.io.*;
class F
{
public static void main(String[] args)
{
File f1 = new File("E:/priya1/Manager.html");
System.out.println(f1.exists());
try
{
  System.out.println(f1.createNewFile());
}
catch (IOException ex)
{
  ex.printStackTrace();
}

System.out.println(f1.exists());
}
}
