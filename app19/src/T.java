import java.text.*;
import java.util.*;
class T
{
  public static void main(String[] args) throws ParseException
  {
    System.out.println(1);
    DateFormat df = DateFormat.getInstance();
    Date d1 = df.parse("abc");
    System.out.println(2);
  }
}
