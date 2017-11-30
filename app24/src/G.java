class G implements Cloneable
{
  public static void main(String[] args)
  throws CloneNotSupportedException
  {
    G g1 = new G();
    G g2 = (G) g1.clone();
    System.out.println(g1);
    System.out.println(g2);
  }
}
