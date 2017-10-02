import java.text.*;
import java.util.*;
class V
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
    catch (ClassNotFoundException ex)
    {

    }
    catch (ParseException ex)
{
  
}
    System.out.println(2);
  }
}
