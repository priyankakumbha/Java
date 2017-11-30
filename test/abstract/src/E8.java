class C
{
    static void test()
    {
        System.out.println("from C test()");
    }
}
public class E8 
{
    public static void main(String[] args)
    {
        System.out.println("from E1 main");
        C.test();
    }
}
