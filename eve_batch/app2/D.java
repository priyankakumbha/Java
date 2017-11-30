class D {
  public static void main(String[] args)
  {
    int i = 0;

    int j = test1(i++) + i++ + test2(i++) + i++ +
            test1(++i) + ++i + test2(++i) + ++i;
    System.out.println(i);
    System.out.println(j);
  }
  static int test1(int i)
  {
    return test2(i++) + i;
  }
  static int test2(int i)
  {
    return ++i;
  }
}
