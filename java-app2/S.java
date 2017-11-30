class S
{
  S()
  {
    this(10);
    System.out.println("S()");
  }
  S(int i)
  {
    this(10,i);
    System.out.println("S(int)");
  }
  S(int i, int j)
  {
    System.out.println("S(int, int)");
  }
  public static void main(String[] args){
    S s1 = new S(10, 20);//1
    System.out.println("-----");
    S s2 = new S(10);//2 constructor
    System.out.println("-----");
    S s3 = new S();// 3 condtructor only possible by this keyword
    System.out.println("-----");
  }

}
