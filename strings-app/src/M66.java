import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M66
{
  public static void main(String[] args)
  {
    String src = "abc xyz hello";
    String exp = "\\s";
    Pattern p1 = Pattern.compile(exp);
    Matcher m1 = p1.matcher(src);
    while(m1.find())
    {
      System.out.println(m1.start() + ":" + m1.group());
    }
    System.out.println("Hello World");
  }
}
