import java.util.HashMap;
class M24
{
  public static void main(String[] args)
  {
    HashMap map = new HashMap();
    System.out.println(map.put(new A(10, 20, 30), "abc"));
    System.out.println("--------------");
    System.out.println(map.put(new A(10, 20, 30), "xyz"));
    System.out.println("--------------");
    System.out.println(map.put(new A(20, 10, 30), "hello"));
    System.out.println("--------------");
    System.out.println(map.put(new A(20, 10, 30), "test"));
    System.out.println("--------------");
    System.out.println(map.put(new A(20, 30, 10), "java"));
    System.out.println("--------------");
    System.out.println(map.put(new A(20, 30, 10), "blr"));
    System.out.println("--------------");
    System.out.println(map.put(new A(50, 30, 10), "pqr"));
    System.out.println("--------------");
    System.out.println(map );
  }
}
