class E3
{
    static int x = test1()+test2();
    public static void main(String[] args)
    {
        System.out.println(x);
    }
    static int test1()
    {
        return 80;
    }
    static int test2()
    {
        return 20;
    }
}
// Main method is not a static method?
