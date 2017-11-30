class O
{
  O()
  {
    System.out.println("O()");
  }
  {
    System.out.println("O-IIB");
  }
}
class P extends O
{
  P()
  {
    System.out.println("P()");//super
  }
  {
    System.out.println("P-IIB");
  }
  public static void main(String[] args)
  {
    P p1 = new P();
    System.out.println("------");
    P p2 = new P();
    
  }
}
