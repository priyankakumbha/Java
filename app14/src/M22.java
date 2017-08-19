class M22
{
  public static void main(String[] args)
  {
    D d1 = new D(20)
    {
      {
        System.out.println("D.AIC_IIB");
      }
    };
  }
}
