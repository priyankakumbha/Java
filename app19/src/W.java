import java.text.*;
import java.util.*;
class W
{
  public static void main(String[] args) throws ParseException
  {
    System.out.println(1);
    DateFormat df = DateFormat.getInstance();
    try
    {
      Date d1 = df.parse("abc");
      Class.forName("");
    }
    catch (Exception ex)
    {

    }

    System.out.println(2);
  }
}
