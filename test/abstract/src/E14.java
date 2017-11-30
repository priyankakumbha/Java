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
public class E14
{
    public static void main(String[] args)
    {
        System.out.println("from E1 main begin");
        C.main(null);
        System.out.println("..........");
        C.main(null);
        System.out.println("from E1 main end");
    }
    static
    {
        System.out.println("from E1 sib");
    }
}
// one class contain any no of static blocks
