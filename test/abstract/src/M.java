class M
{
    static int j;
    static
    {
        System.out.println("sib:"+j);
        test();
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
