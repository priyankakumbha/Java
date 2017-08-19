class M28
{
  public static void main(String[] args)
  {
    A a1 = new B();
    if(a1 instanceof A)
    {
      System.out.println("we can convert into A");
      A a2 = (A) a1;
    }
    if(a1 instanceof B)
    {
      System.out.println("we can convert into B");
      B b1= (B) a1;
    }
    if(a1 instanceof C)
    {
      System.out.println("we can convert into C");
      C c1= (C) a1;
    }
    if(a1 instanceof D)
    {
      System.out.println("we can convert into D");
      D d1= (D) a1;
    }
    if(a1 instanceof E)
    {
      System.out.println("we can convert into D");
      E e1= (E) a1;
    }
  }
}
