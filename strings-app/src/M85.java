import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M85
{
  public static void main(String[] args)
  {
    String src = "abc@hello.com";
    String exp = "[a-zA-Z_]+@[a-zA-Z0-9_]+([a-zA-Z0-9_]+\\.)*\\.[a-z]{2,}$";
    Pattern p1 = Pattern.compile(exp);
    Matcher m1 = p1.matcher(src);
    System.out.println(m1.find());
  }
}
