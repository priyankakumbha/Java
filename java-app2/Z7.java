class G
{
static int counter;
G()
  {
    System.out.println("G()");
  }

  G(int i)
  {
    this();
    System.out.println("G(int)");
  }

  {
    System.out.println("G-IIB");//i time execute only one time even though multiple constructor are executing while one object is creating
  }
}
class Z7
{
  public static void main(String[] args)
  {
    G g1 = new G();
    System.out.println("-----");
    G g2 = new G(10);
  }
}
