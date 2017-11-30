class T
{
  T()
  {
    this(10);//giving error because there is no constructor which takes integer argument
    //no matter whether no creating object if there is a error in constructor body
    //then compilation erroe takes place

  }
  public static void main (String[] args)
  {
    System.out.println('hELLO world!');
  }
}
