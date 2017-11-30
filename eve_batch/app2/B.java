class B {
  public static void main(String[] args)
  {
    int i = 0;
    //test(0) + 1 + test(1) + 3
    int j = test(i++) + i++ + test(i++) + i++;
    System.out.println(i);
    System.out.println(j);
  }
  static int test(int i)//0
  {
    return ++i;//1
  }
}
