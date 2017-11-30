class I
{
    static int x = test();
    public static void main(String[] args)
    {
        System.out.println(x);
    }
    static int test()
    {
        System.out.println(x);
        return 100;
    }
}
