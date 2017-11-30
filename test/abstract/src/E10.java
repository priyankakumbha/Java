class E10
{
    static int x = test();
    public static void main(String[] args)
    {
        System.out.println("main:"+x);
    }
    static int test()
    {
        System.out.println("from test");
        main(null);
        return 100;
    }
}
