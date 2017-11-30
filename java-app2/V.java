class V
{
  V()//calling second constructor
  {
    this(90);
  }
  V(int i)//calling first constructor
  {
    this();//recursive invocation not allowed
    //first constructor should not call to second and second constructor should not call to first constructor
  }
  public static void main (String[] args)
  {
    System.out.println("done");
  }
}
