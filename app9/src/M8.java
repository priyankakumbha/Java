class M8
{
  public static void main(String[] args)
  {
    C c1 = (C) new E();//(C) is ont required ,
    // no expilict upcasting required
    A a1 = (A) new D();
    Object obj = (C) new E();
    System.out.println("done");
  }
}
