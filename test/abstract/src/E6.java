class C
{
    public static void main(String[] args)
    {
        System.out.println("from C main");
    }
    static
    {
        System.out.println("from C sib");
    }
}
public class E6
{
    public static void main(String[] args)
    {
        System.out.println("from E1 main begin");
        C.main(null);
        System.out.println("from E1 main end");
    }
    static
    {
        System.out.println("from E1 sib");
    }
}
