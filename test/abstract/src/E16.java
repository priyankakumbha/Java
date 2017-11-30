class E16
{
    static int i= test();
    public static void main(String[] args)
    {
        System.out.println("from main");
    }
    static
    {
        System.out.println("from sib1");
    }
    static int test()
    {
        System.out.println("from test");
        return 10;
    }
}
