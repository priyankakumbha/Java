class E18
{
    static int j=test();
    static
    {
        System.out.println("sib:"+j);
        main(null);
    }
    static int test()
    {
        System.out.println("test:"+j);
        main(null);
        return 20;
    }
    public static void main(String[] args)
    {
        System.out.println("main:"+j);
        j=100;
    }
}
// While creating object every  static member is loading into the memory True/False
