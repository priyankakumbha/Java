class A7
{
  public static void main(String[] args)
  {
      System.out.println("main begin");
      if (false){
        System.out.println("if begin");
        if(true){
          System.out.println(" inner if");
        }
        System.out.println("if end");
      }
    System.out.println("main end");
  }
}
