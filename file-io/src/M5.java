import java.io.*;
class M5
{
public static void main(String[] args)
throws IOException, ClassNotFoundException
{
  FileInputStream fin = new FileInputStream("test2.ser");
  ObjectInputStream in = new ObjectInputStream(fin);
  Person p1 = (Person) in.readObject();
  in.close();
  fin.close();
  System.out.println(p1.name);
  System.out.println(p1.age);
  System.out.println(p1.weight);
}
}
