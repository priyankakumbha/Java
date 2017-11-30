import java.text.*;
import java.util.*;
class R
{
  public static void main(String[] args) throws IOException
  {
    System.out.println(1);
    DateFormat df = DateFormat.getInstance();
    Date d1 = df.parse("abc");
    System.out.println(2);
  }
}
