class C {
  public static void main(String[] args)
  {
    int i = 0;
    //1   + 1 + test(2)=5+3
    int j = test(i++) + i++ + test(i++) + i++;
    System.out.println(i);//4
    System.out.println(j);//10
  }
  static int test(int i)
  {
    return test1(i++) + i;
    //0+1
    //test1(2)=2+3
  }
  static int test1(int i)
  {
    return i++;//1
  }
}
