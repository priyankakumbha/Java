class H
{
public static void main(String[] args)
{
  //byte, short, int
  byte i = 10;
  switch(i)
  {
    case 1:
    System.out.println("case 1");
    case 5:
    System.out.println("case 5");
    case 130://gives error because out of byte range
    System.out.println("case 12");
    break;
    default:
    System.out.println("from default");
    break;
    case 15:
    System.out.println("from default1");
  }
  System.out.println("end");
}
}
