class L
{
    static int o;
    static
    {
        System.out.println("Lsib()");
    }
}
public class E13
{
    public static void main(String[] args)
    {
        System.out.println(L.o);
        System.out.println(L.o);
    }
    static
    {
        System.out.println("E1 sib");
    }
}
// what is a static in java
