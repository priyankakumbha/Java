class L
{
    static int o;
    static
    {
        System.out.println("Lsib()");
    }
}
public class E9
{
    public static void main(String[] args)
    {
        System.out.println(L.o);
    }
}
// first all static members are executed got over, then only main() method will be executed
