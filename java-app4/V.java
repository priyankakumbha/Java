class V
{
  V()
  {
    this(10);
    System.out.println("V()");
  }
  V(int i)
  {
    System.out.println("V()");
  }
  {
    System.out.println("V-IIB");
  }

    public static void main(String[] args)
    {
      V v1 = new V();
      System.out.println("-------");
      V v2 = new V(90);
    }
  }
