import java.util.Vector;
import java.util.Enumeration;
class M55
{
  public static void main(String[] args)
  {
    Vector v1= new Vector();
    v1.add(90);
    v1.add(910);
    v1.add(190);
    v1.add(920);
    Enumeration e1 = v1.elements();
    Object obj = null;
    while(e1.hasMoreElements())
    {
      obj = e1.nextElement();
      System.out.print(obj + ",");
    }
  }
}
