@interface A
{
int version();
String author();
}
@A(author= "abc")
class M5
{
  @A(author = "abc", version=4)
  public static void main(String[] args)
  {
    System.out.println("Hello world!");
  }
}
