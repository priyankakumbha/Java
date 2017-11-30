class C {
  static int i = test();//10
  static int j = test();//i=10+10
  //k=10+20+0+10
  static int k = i + j + test();//10+20+40 (10+20+10)
  static int test()
  {
    return i + j + k + 10;
  }
  public static void main(String[] args)
  {
    System.out.println(i + "," + j + "," + k);
  }
}
