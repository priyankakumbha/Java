class C
{
  static C obj;
  protected void finalize()
  {
    System.out.println("from finalize");
    obj = this;
  }
}
