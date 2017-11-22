import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M55
{
  public static void main(String[] args)
  {
    String src = "Hello To All";
    String exp = "o";
    Pattern p1 = Pattern.compile(exp);
    Matcher m1 = p1.matcher(src);
    while(m1.find())
    {
      System.out.println(m1.start() + ":" + m1.group());
    }
    System.out.println("Hello World");
  }
}
