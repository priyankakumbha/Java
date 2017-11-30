class P
{
  public static void main(String[] args)
  {
    Boolean b1 = new Boolean("true");
    Boolean b2 = Boolean.valueOf("true");
    Boolean b3 = new Boolean(false);
    Boolean b4 = Boolean.valueOf(true);
    boolean b5 = b3.booleanValue();
    System.out.println("done");
  }
}
