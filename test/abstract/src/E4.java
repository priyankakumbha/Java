class L
{
    static int o;
    static
    {
        System.out.println("Lsib()");
    }
}
public class E4
{
    public static void main(String[] args)
    {
        int j=L.o;
        System.out.println("main");
    }
}
