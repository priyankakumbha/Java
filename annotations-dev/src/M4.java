@interface A
{
int version();
String author();
}
@A(version=3, author= "abc")
class M4
{
  @A(version=4)
  public static void main(String[] args)
  {
    System.out.println("Hello world!");
  }
}
