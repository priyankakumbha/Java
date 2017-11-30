class Z7
{
  public static void main(String[] args)
  {
    boolean flag = true;
    if(!flag)// here checking no assignment that s why value at line 10 is true
    {
      System.out.println("from if");
    }
    System.out.println(flag);
    System.out.println("from end");
  }
}
