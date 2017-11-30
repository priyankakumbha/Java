import java.text.*;
import java.util.*;
class S
{
  public static void main(String[] args)
  {
    System.out.println(1);
    DateFormat df = DateFormat.getInstance();
    try
    {
        Date d1 = df.parse("abc");
    }
  catch (ParseException ex)
  {
    System.out.println("catch");
  }
    System.out.println(2);
  }
}
